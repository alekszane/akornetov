package ru.job4j.collections.sort;

import org.jetbrains.annotations.NotNull;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 19.03.2018.
 */
public class User implements Comparable{

	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age  = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(@NotNull Object o) {
		return 0;
	}
}
