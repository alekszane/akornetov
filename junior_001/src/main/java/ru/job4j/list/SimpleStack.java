package ru.job4j.list;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 22.06.2018.
 *	Class realize collection Stack  LIFO - next input first output.
 */
public class SimpleStack<T> {

	/**
	 * The field contain all data<T> elements.
	 */
	private SimpleArrayList<T> collection = new SimpleArrayList<>();
	/**
	 * The method return last added element and remove it from collection.
	 * @return T data of deleted element.
	 */
	public T poll() {
		return this.collection.delete();
	}
	/**
	 * The method add element in collection.
	 * @param value element of T type to add in collection.
	 */
	public void push(T value) {
		this.collection.add(value);
	}
}

