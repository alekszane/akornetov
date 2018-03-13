package ru.job4j.collections;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 18.02.2018.
 */
public class Person {
private  String name;
private  String surname;
private String phone;
private String address;

public Person(String name, String surname, String phone, String address) {
	this.name = name;
	this.surname = surname;
	this.phone = phone;
	this.address = address;
}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}


}
