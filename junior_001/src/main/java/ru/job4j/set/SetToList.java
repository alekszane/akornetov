package ru.job4j.set;

import org.jetbrains.annotations.NotNull;
import ru.job4j.list.SimpleLinkedList;

import java.util.Iterator;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 30.07.2018.
 */
public class SetToList<E> implements Iterable<E> {
private SimpleLinkedList<E> list = new SimpleLinkedList<E>();


public void add(E e) {
	Iterator it = list.iterator();
	boolean noDuplicate = true;
	while (it.hasNext()) {
		if (e.equals(it.next())) {
			noDuplicate = false;
		}
	}
	if (e != null && noDuplicate) {
		list.add(e);
	}
}

public E get(int index) {
	return list.get(index);
}
	/**
	 * Returns an iterator over elements of type {@code T}.
	 * @return an Iterator.
	 */
	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}
}
