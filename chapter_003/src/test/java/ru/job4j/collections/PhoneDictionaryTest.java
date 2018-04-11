package ru.job4j.collections;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 18.02.2018.
 */
public class PhoneDictionaryTest {
	@Test
	public void whenFindByName() {
		PhoneDictionary phones = new PhoneDictionary();
		phones.addPerson(new Person("Aleksey", "Kornetov", "+79167485031", "Moskow"));
		phones.addPerson(new Person("Leonid", "Sidorov", "+796464654", "Moskow"));
		List<Person> persons = phones.findPerson("Sid");
		assertThat(persons.iterator().next().getSurname(), is("Sidorov"));
	}
}
