package ru.job4j.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 29.05.2018.
 */
public class UserStoreTest {
	@Test
	public void whenAddNewItemThenGetItem() {
		User user = new User("Вася");
		User user2 = new User("Толя");
		UserStore userStore = new UserStore(2);
		userStore.add(user);
		userStore.add(user2);
		Base result = userStore.findById("Вася");
		Assert.assertThat(result, is(user));
	}

	@Test
	public void whenDeletItemThenItNotFoundInStore() {
		User user = new User("Вася");
		User user2 = new User("Толя");
		UserStore userStore = new UserStore(2);
		userStore.add(user);
		userStore.add(user2);
		userStore.delete("Вася");
		Base result = userStore.findById("Вася");
		Base expected = null;
		Assert.assertThat(result, is(expected));
	}

	@Test
	public void whenReplaceItemThenGetReplaceItem(){
		User user = new User("Вася");
		User user2 = new User("Толя");
		User user3 = new User("Коля");
		UserStore userStore = new UserStore(3);
		userStore.add(user);
		userStore.add(user2);
		userStore.replace("Вася", user3);
		Base result = userStore.findById("Коля");
		Assert.assertThat(result, is(user));
	}
}