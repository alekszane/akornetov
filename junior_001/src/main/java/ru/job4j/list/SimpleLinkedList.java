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
	private  int size; // Considers elements with collection/
	private Node<E> first; // Link to first element in collection.
	private Node<E> last; // Link to last element in collection.
	private int indexList = 0; //Index of list.

	/***Getters and setters ***/
	public int getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Node<E> getFirst() {
		return first;
	}
	public void setFirst(Node<E> first) {
		this.first = first;
	}
	public Node<E> getLast() {
		return last;
	}
	public void setLast(Node<E> last) {
		this.last = last;
	}
	public int getIndexList() {
		return indexList;
	}
	public void setIndexList(int indexList) {
		this.indexList = indexList;
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
	 * The method return node from collection.
	 * @param index node to return.
	 * @return node at specific index position.
	 */
	public Node<E> getNode(int index) {
		Node<E> result = null;
		for (int i = 0; i < index; i++) {
			result = result.next;
		}
		return result;
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

	public E delete(int index) {
		return this.deleteNode(index).date;
	}

	public E delete() {
		Node<E> getFirst = first;
		this.first = first.next;
		this.size--;
		return getFirst.date;
	}

	/**
	 * The method remove node from collection with index.
	 * @param index node to remove.
	 * @return removed node.
	 */
	public Node<E> deleteNode(int index) {
		Node<E> prevNode = this.getNode(index - 1);
		Node<E> delNode = this.getNode(index);
		Node<E> afterNode = this.getNode(index + 1);
		prevNode.next = afterNode;
		if (index == 0) {
			this.first = afterNode;
		}
		this.size--;
		return delNode;
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
			// Method check prev element in collection/
			@Override
			public boolean hasNext() throws ConcurrentModificationException {
				if (size != modCount) {
					throw new ConcurrentModificationException("Collection has been modified!");
				}
				return itrPosition <= size;
			}
			/**
			 * @return prev element of iteration.
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