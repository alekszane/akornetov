package ru.job4j.search;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

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
	public int compareTo(@NotNull Task o) {
		Task entry = (Task) o;
		int result = priority - entry.priority;
		if (result != 0) {
			return result / Math.abs(result);
		}
		return result;
	}
}


