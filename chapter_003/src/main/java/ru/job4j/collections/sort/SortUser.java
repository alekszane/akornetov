package ru.job4j.collections.sort;

import javax.jws.soap.SOAPBinding;
import java.util.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 19.03.2018.
 */
public class SortUser {

	/*Метод выполняет сортировку User по полю Age*/
	public Set<User> sort(List<User> list) {

		Set<User> users = new TreeSet<>();
		for (User user : list) {
			users.add(user);
		}
		for (User user : users) {
			System.out.println(user.getAge());
		}
		return users;
	}
}
