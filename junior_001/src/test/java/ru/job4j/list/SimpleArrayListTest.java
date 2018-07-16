package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 03.06.2018.
 */
public class SimpleArrayListTest {
	private SimpleArrayList<Integer> list;

	@Before
	public void beforeTest() {
		list = new SimpleArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
	}

	@Test
	public void whenAddThreeElementsThenUseGetOneResultTwo() {
		assertThat(list.get(1), is(2));
	}

	@Test
	public void whenAddThreeElementsThenUseGetSizeResultThree() {
		assertThat(list.getSize(), is(3));
	}

	@Test
	public void whenDeleteOneElementsThenUseGetSizeResultTwo() {
		list.delete();
		assertThat(list.get(0), is(2));
		assertThat(list.getSize(), is(2));
		list.delete();
		assertThat(list.getSize(), is(1));
		assertThat(list.get(0), is(1));
	}
}