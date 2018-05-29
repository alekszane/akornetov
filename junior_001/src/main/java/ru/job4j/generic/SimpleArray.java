package ru.job4j.generic;

import org.jetbrains.annotations.NotNull;
import java.util.Iterator;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 24.05.2018.
 */
public class SimpleArray<T> implements Iterable {
	Object[] array;
	int index;

	public SimpleArray(int size) {
		this.array = new Object[size];
	}

	private void checkIndex(int index) {
		if (index >= this.array.length) {
			throw new IndexOutOfBoundsException();
		}
	}

	public void add(T model) {
		if (this.index < this.array.length) {
			this.array[index++] = model;
		}
	}

	public void set(int index, T model) {
		this.array[this.index] = model;
	}

	public void delete(int index) {
		checkIndex(index);
		int movedLength = this.index - index - 1;
		System.arraycopy(this.array, index + 1, this.array, index, movedLength);
		this.array[--this.index] = null;
	}

	public T get(int index) {
		checkIndex(index);
		return (T) this.array[index];
	}

	/**
	 * Returns an iterator over elements of type {@code T}.
	 *
	 * @return an Iterator.
	 */
	@NotNull
	@Override
	public Iterator<T> iterator() {
		return (Iterator<T>) array[index];
	}
}