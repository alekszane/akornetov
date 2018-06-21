package ru.job4j.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 17.06.2018.
 */
public class DinamicListTest {
	private DinamicList<Integer> dinamicList = new DinamicList<>(3);

	@Before
	public void before() {
		dinamicList.add(1);
		dinamicList.add(2);
		dinamicList.add(3);
	}

	@Test
	public void whenAddElementsThenReturnThis() {
		Assert.assertThat(dinamicList.get(0), is(1));
		Assert.assertThat(dinamicList.get(1), is(2));
		Assert.assertThat(dinamicList.get(2), is(3));
	}

	@Test
	public void whenIteratorCreateThenNextReturnElementsSequentially() {
		Iterator<Integer> iterator = dinamicList.iterator();
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(1));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(2));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(3));
	}

	@Test (expected = ConcurrentModificationException.class)
	public void whenCollectionChangedThenTrowException() {
		Iterator<Integer> iterator = dinamicList.iterator();
		dinamicList.add(4);
		iterator.hasNext();
	}

}