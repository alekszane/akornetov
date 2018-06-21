package ru.job4j.list;

import java.util.HashMap;
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

	//Default constructor.
	public Node(E date) {
		this.date = date;
	}


	/**
	 * This method compare Node object by date.
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return  true;
		}

		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Node<E> node = (Node<E>) obj;
		return this.date.equals(node.date);
	}

	/**
	 * @return hash of that object.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(date);
	}
}
