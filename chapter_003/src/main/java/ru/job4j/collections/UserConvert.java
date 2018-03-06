package ru.job4j.collections;

import java.util.HashMap;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 06.03.2018.
 */
 /*Метод принимает в себя список пользователей и конвертирует его в Map с ключом Integer id и
  соответствующим ему User.*/
public class UserConvert {
	HashMap<Integer, User> process(List<User> list) {
		User[] users = list.toArray(new User[list.size()]);
		HashMap<Integer, User> mapUser = new HashMap<Integer, User>();

		for (int i = 0; i < users.length; i++) {
			int id = users[i].getId();
			mapUser.put(id, users[i]);
		}
		return mapUser;
	}
}
