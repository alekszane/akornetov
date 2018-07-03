package ru.job4j.list;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 25.06.2018.
 */
public class SimpleQueue<T> {

	private SimpleArrayList<T> collection = new SimpleArrayList<>();

	public void push(T value) {
		collection.add(value);
	}

	public T poll() {
		return collection.delete(collection.getSize() - 1);
	}
}
