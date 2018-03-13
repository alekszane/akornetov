package ru.job4j.collections;

import java.util.Collections;
import java.util.LinkedList;



/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 20.02.2018.
 */
public class PriorityQueue {
	public LinkedList<Task> tasks = new LinkedList<Task>();

	/**
	 * Метод должен вставлять в нужную позицию элемент.
	 * Позиция определять по полю приоритет.
	 * Для вставик использовать add(int index, E value)
	 * @param task задача
	 */

	public void put(Task task) {
		tasks.add(task);
		Collections.sort(tasks);
	}

	public Task take() {
		return this.tasks.poll();
	}
}
