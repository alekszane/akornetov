package ru.job4j.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 13.06.2018.
 */
public class DinamicList<E> implements Iterable<E> {

	private Object[] container; // Container for data storage.
	private int position = 0;

	DinamicList(int size) {
	this.container = new Object[size];
	}

	/**
	 * This method add element to collection, and
	 * @param value
	 */
	 void add(E value) {
		 if (this.container.length >= this.position) {
			 this.container = Arrays.copyOf(this.container, this.container.length * 2);
		 }
		this.container[position] = value;
		position++;
	}

	/**
	 * This method return sent index element from collection.
	 * @param index
	 * @return element E type.
	 * @throws ArrayIndexOutOfBoundsException
	 */
	 E get(int index) throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index > this.container.length) {
			throw new ArrayIndexOutOfBoundsException("Index out of range container!");
		}
		return (E) this.container[index];
	}
	/**
	 * Returns an iterator over elements of type {@code T}.
	 *
	 * @return an Iterator.
	 */
	@Override
	public Iterator<E> iterator() {

		return new Iterator<E>() {
		/*
		 *Check  fail-fast, if not equals when collection modified.
		 */
			int modCount = position;
		/*
		 * Field position for iteration elements.
		 */
			int itrPosition = 0;

			/**
			 * Method check iterator has prev element.
			 * @return Return true, if more left elements to iterate.
			 * @throws  ConcurrentModificationException Throw when collection modified.
			 */
			@Override
			public boolean hasNext() throws ConcurrentModificationException {
				boolean result = false;
				if (itrPosition != container.length - 1) {
					result = true;
				}
				if (modCount != position) {
					throw new ConcurrentModificationException("Collection has been modified!");
				}
				return  result;
			}

			/**
			 * Returns the prev element in the iteration.
			 * @return element
			 * @throws NoSuchElementException if no more elements to iterate.
			 */
			@Override
			public E next()throws NoSuchElementException {
				if (hasNext()) {
				return (E) container[itrPosition++];
				}
				throw new NoSuchElementException("No more left element in collection!");
			}
		};
	}
}
