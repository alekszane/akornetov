package ru.job4j.list;

import org.jetbrains.annotations.NotNull;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 20.06.2018.
 */
public class SimpleLinkedList<E> implements Iterable<E> {

	/**
	 * The field contain link to last added element in collection.
	 */
	private Node<E> first;
	/**
	 * Getter for field size.
	 * @return current size collection.
	 */

	public Node<E> getFirst() {
		return first;
	}

	/**
	 * The field counter elements in collection.
	 */
	private int size;

	public int getSize() {
		return this.size;
	}
	/**
	 * The method add element in collection.
	 * @param data generic type that collection store.
	 */

	public void add(E data) {
		Node<E> newLink = new Node<>(data);
		newLink.next = this.first;
		this.first = newLink;
		this.size++;
	}
	/**
	 * The method return data that store in node.
	 * @param index order number that node be added in collection.
	 * @return data that contain node.
	 */
	public E get(int index) {
		int position = this.size - index;
		Node<E> current = first;
		Node<E> result = first;
		for (int i = 0; i < position; i++) {
			result = current.next;
			current = result;
		}
		return result.date;
	}
	/**
	 * Returns an iterator over elements of type {@code T}.
	 *
	 * @return an Iterator.
	 */
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			/**
			 * The field need to check fail fast behavior.
			 */
			private int failFast = size;
			/**
			 * The field count how many method next return elements.
			 */
			private int positionIt = 1;
			/**
			 * The method check iterator has next element.
			 * @return Return true, if more left elements to iterate, otherwise return false.
			 * @throws ConcurrentModificationException Throw when collection modified, after iterator create.
			 */
			@Override
			public boolean hasNext() throws ConcurrentModificationException {
				if (size != failFast) {
					throw new ConcurrentModificationException("Collection has been modified!");
				}
				return positionIt <= size;
			}
			/**
			 * The method return next element in iteration.
			 * @return element.
			 * @throws NoSuchElementException Throw if no more elements to iterate.
			 */
			@Override
			public E next() throws NoSuchElementException {
				if (hasNext()) {
					return get(positionIt++);
				}
				throw new NoSuchElementException("No more elements left in collection");
			}
		};
	}
}