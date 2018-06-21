package ru.job4j.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 20.06.2018.
 */
public class SimpleLinkedList<E> implements Iterable<E> {
	// Considers elements with collection/
	private  int size;
	// Link to last element in collection.
	private Node<E> first;

	public int getSize() {
		return this.size;
	}

	/** Method add elemements in collection.
	 * @param value
	 */
	public void add(E value) {
		Node<E> newLink = new Node<>(value);
		newLink.next = this.first;
		this.first = newLink;
		this.size++;
	}

	/**
	 * @param index
	 * @return Node, return data that store in node.
	 */
	public E get(int index) {
		Node<E> result = this.first;
		for (int i = 0; i < size - index; i++) {
			result = result.next;
		}
		return result.date;
	}

	/**
	 * Returns an iterator over elements of type {@code T}.
	 * @return an Iterator.
	 */
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
		/*
		 *Check  fail-fast, if not equals when collection modified.
		 */
		int modCount = size;
		/*
		 * Position for iteration elements.
		 */
		int itrPosition = 1;
			// Method check next element in collection/
			@Override
			public boolean hasNext() throws ConcurrentModificationException {
				if (size != modCount) {
					throw new ConcurrentModificationException("Collection has been modified!");
				}
				return itrPosition <= size;
			}
			/**
			 * @return next element of iteration.
			 * @throws NoSuchElementException If no more element.
			 */
			@Override
			public E next() throws NoSuchElementException {
				if (hasNext()) {
					return get(itrPosition++);
				}
				throw new NoSuchElementException("No more element in collection");
			}
		};
	}
}
