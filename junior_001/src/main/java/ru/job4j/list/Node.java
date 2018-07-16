package ru.job4j.list;

import java.util.Objects;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 20.06.2018.
 */
public class Node<E> {
	//Field contain date.
	E date;
	//Field link to next Node.
	Node<E> next;

	int index; // index position node.

	public Node(E date) {
		this.date = date;
	}

	public E getDate() {
		return this.date;
	}
}
