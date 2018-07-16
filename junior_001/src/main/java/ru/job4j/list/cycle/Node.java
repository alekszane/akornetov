package ru.job4j.list.cycle;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 05.07.2018.
 */
public class Node<T> {
	T value;
	Node<T> next;

	public Node(T value) {
		this.value = value;
	}
}
