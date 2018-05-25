package ru.job4j.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 24.05.2018.
 */
public class SimpleArrayTest {
	@Test
	public  void whenAddNewSimpleArrayStringThenGetSameString() {
		SimpleArray<String> simpleArray = new SimpleArray(2);
		simpleArray.add("Hi");
		String res = simpleArray.get(0);
		Assert.assertThat(res, is("Hi"));
	}

	@Test
	public  void whenAddNewSimpleArrayIntegerThenGetSameInteger() {
		SimpleArray<Integer> simpleArray = new SimpleArray(1);
		simpleArray.add(2);
		Integer res = simpleArray.get(0);
		Assert.assertThat(res, is(2));
	}

	@Test
	public  void whenDeleteLastItemThenGetsPrevItem() {
		SimpleArray<Integer> simpleArray = new SimpleArray(2);
		simpleArray.add(5);
		simpleArray.add(2);
		simpleArray.delete(1);
		Integer res = simpleArray.get(0);
		Assert.assertThat(res, is(5));
	}
}