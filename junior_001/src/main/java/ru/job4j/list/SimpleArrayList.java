package ru.job4j.list;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 03.06.2018.
 */
/**
 * Класс SimpleArrayList.
 */
public class SimpleArrayList<E> implements Iterable<E> {

	private int size; //Field contain number element collection.
	private Node<E> first; //Field contain link of the first element.
	private int indexList = 0;
	/**
	 * Default constructor.
	 */
	public SimpleArrayList() {
	}

	public SimpleArrayList(Node<E> node) {
		this.first = node;
		this.first.index = 0;
		this.indexList = 0;
		this.size++;
	}
	/**
	 * Метод вставляет в начало списка данные.
	 */
	public void add(E date) {
		Node<E> newLink = new Node<E>(date);
		newLink.next = this.first;
		newLink.index = ++this.indexList;
		this.first = newLink;
		this.size++;
	}


	/**
	 * Implements The method deleting first element in list.
	 * @return deleted element.
	 */
	public E delete() {
		Node<E> inFirst = first;
		this.first = first.next;
		this.size--;
		return inFirst.date;
	}
	/**
	 * Реализовать метод удаления первого элемента в списке.
	 */
	public E delete(int index) {
		Node<E> f = first;
		if (f == null) {
			throw new NoSuchElementException();
		}
		return this.deleteNode(index).date;
	}

	/** Method delete element index of collection.
	 * @param index
	 * @return Node<E> deleted element.
	 */
	public Node<E> deleteNode(int index) {
		Node<E> prevN = this.getNode(index - 1);
		Node<E> thisN = this.getNode(index);
		Node<E> nextN = this.getNode(index + 1);
		prevN.next = nextN;
		if (index == 0) {
			this.first = nextN;
		}
		this.size--;
		return thisN;
	}
	/**
	 * Метод получения элемента по индексу.
	 */
	public Node<E> getNode(int index) {
		Node<E> result = this.first;
		for (int i = 0; i < index; i++) {
			result = result.next;
		}
		return result;
	}

	/**
	 * @param index
	 * @return find index element.
	 */
	public E get(int index) {
		return this.getNode(index).date;
	}

	/**
	 * Метод получения размера коллекции.
	 */
	public int getSize() {
		return this.size;
	}


	/**
	 * Returns an iterator over elements of type {@code T}.
	 *
	 * @return an Iterator.
	 */
	@NotNull
	@Override
	public Iterator<E> iterator() {
		return null;
	}
}
