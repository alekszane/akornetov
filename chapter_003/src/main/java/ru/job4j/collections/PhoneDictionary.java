package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 18.02.2018.
 */
public class PhoneDictionary {

	private List<Person> persons = new ArrayList<>();

	public void addPerson(Person person) {
		this.persons.add(person);
	}

	/**
	 * Вернуть список всех пользователей, который содержат key в любых полях.
	 *
	 * @param key Ключ поиска.
	 * @return Список подошедших пользователей.
	 **/
	public List<Person> findPerson(String key) {
		List<Person> result = new ArrayList<>();
			for (Person pers : persons) {
				if (pers.getSurname().contains(key) || pers.getName().contains(key) || pers.getPhone().contains(key) || pers.getAddress().contains(key)) {
					result.add(pers);
				}
			} return result;
		}
}





