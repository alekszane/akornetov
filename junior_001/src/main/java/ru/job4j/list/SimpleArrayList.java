package ru.job4j.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 03.06.2018.
 */
/**
 * Класс SimpleArrayList.
 */
public class SimpleArrayList<E> {

	private int size;
	private Node<E> first;

	/**
	 * Метод вставляет в начало списка данные.
	 */
	public void add(E date) {
		Node<E> newLink = new Node<>(date);
		newLink.next = this.first;
		this.first = newLink;
		this.size++;
	}

	public E unlinkFirst(Node<E> f) {
		final Node<E> next = f.next;
		this.first = next;
		return first.date;
	}
	/**
	 * Реализовать метод удаления первого элемента в списке.
	 */
	public E delete() {
		final Node<E> f = first;
		if (f == null) {
			throw new NoSuchElementException();
		}
		return unlinkFirst(f);
	}

	/**
	 * Метод получения элемента по индексу.
	 */
	public E get(int index) {
		Node<E> result = this.first;
		for (int i = 0; i < index; i++) {
			result = result.next;
		}
		return result.date;
	}

	/**
	 * Метод получения размера коллекции.
	 */
	public int getSize() {
		return this.size;
	}
}
