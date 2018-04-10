package ru.job4j.collections;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 20.02.2018.
 */
public class Task implements Comparable<Task> {
	private String desc;
	private int priority;



	public Task(String desc, int priority) {
		this.desc = desc;
		this.priority = priority;

	}

	public String getDesc() {
		return desc;
	}

	public int getPriority() {
		return priority;
	}


	@Override
	public int compareTo( Task o) {
		Task entry = (Task) o;
		int result = priority - entry.priority;

		return result != 0 ? result / Math.abs(result): result;
	}
}


