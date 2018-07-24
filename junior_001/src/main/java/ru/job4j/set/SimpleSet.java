package ru.job4j.set;

import org.jetbrains.annotations.NotNull;
import ru.job4j.list.DinamicList;

import java.util.Iterator;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 12.07.2018.
 */
public class SimpleSet<E> implements Iterable<E> {
	private DinamicList<E> dinamicList = new DinamicList<>();


	public void add(E e) {
			this.dinamicList.add(e);
	}

	public E get(int index) {
		return dinamicList.get(index);
	}

	/**
	 * Returns an iterator over elements of type {@code T}.
	 * @return an Iterator.
	 */
	@Override
	public Iterator<E> iterator() {
		return dinamicList.iterator();
	}
}
