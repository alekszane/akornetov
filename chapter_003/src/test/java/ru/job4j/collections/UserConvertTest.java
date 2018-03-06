package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 06.03.2018.
 */
public class UserConvertTest {

	@Test
	public void whenListToMapIsTrue() {
	UserConvert userConvert = new UserConvert();
		User user1 = new User(1, "Aleksey", "Moscow");
		User user2 = new User(2, "Andrey", "Voronez");
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		HashMap<Integer, User> result = userConvert.process(list);
		HashMap<Integer, User> expect = new HashMap<Integer, User>();
		expect.put(1, user1);
		expect.put(2, user2);
		assertThat(result, is (expect));
	}

}
