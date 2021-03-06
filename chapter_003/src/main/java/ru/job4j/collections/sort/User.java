package ru.job4j.collections.sort;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 19.03.2018.
 */
public class User implements Comparable<User> {

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
	public int compareTo(User o) {

		User entry = (User) o;

		int result = age - entry.getAge();

		return result != 0 ? result / Math.abs(result) : 0;
	}
}
