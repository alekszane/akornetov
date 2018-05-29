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
public class RoleStoreTest {
	@Test
	public void whenAddNewItemThenGetItem() {
		Role role = new Role("role1");
		Role role2 = new Role("role2");
		RoleStore roleStore = new RoleStore(2);
		roleStore.add(role);
		roleStore.add(role2);
		Base result = roleStore.findById("role1");
		Assert.assertThat(result, is(role));
	}

	@Test
	public void whenDeletItemThenItNotFoundInStore() {
		Role role = new Role("role1");
		Role role2 = new Role("role2");
		RoleStore roleStore = new RoleStore(2);
		roleStore.add(role);
		roleStore.add(role2);
		roleStore.delete("role1");
		Base result = roleStore.findById("role1");
		Base expected = null;
		Assert.assertThat(result, is(expected));
	}

	@Test
	public void whenReplaceItemThenGetReplaceItem() {
		Role role = new Role("role1");
		Role role2 = new Role("role2");
		Role role3 = new Role("role3");
		RoleStore roleStore = new RoleStore(3);
		roleStore.add(role);
		roleStore.add(role2);
		roleStore.replace("role1", role3);
		Base result = roleStore.findById("role3");
		Assert.assertThat(result, is(role));
	}
}