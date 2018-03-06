package ru.job4j.collections;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 06.03.2018.
 */
public class User {

private int id;
private String name;
private String city;

public User(int id, String name, String city) {
	this.id = id;
	this.name = name;
	this.city = city;
}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}
}
