package ru.job4j.collections.sort;

import org.junit.Test;
import ru.job4j.collections.*;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 19.03.2018.
 */
public class SortUserTest {
	@Test
	public void whenGetSortUserAgeIsTrue() {
	SortUser sorter = new SortUser();

	List<User> usersList = new ArrayList<>();
		usersList.addAll(
			Arrays.asList(
					new User("Petr", 55),
					new User("Vasya", 29),
					new User("Aleksey", 300)
			)
		);
		Set<User> result = sorter.sort(usersList);

		Set<User> users = new TreeSet<>();
			users.addAll(
				Arrays.asList(
					new User("Vasya", 29),
					new User("Petr",55 ),
					new User("Aleksey", 300)
				)
			);
		assertThat(result, is (users));
	}
}
