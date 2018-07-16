package ru.job4j.list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.is;


/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 21.06.2018.
 */
public class SimpleLinkedListTest {

	SimpleLinkedList<Integer> simpleList = new SimpleLinkedList();
	@Before
	public void setUp() throws Exception {
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
	}

	@Test
	public void whenAddElementThenReturnThem() {
		Assert.assertThat(simpleList.get(1), is(1));
		Assert.assertThat(simpleList.get(2), is(2));
		Assert.assertThat(simpleList.get(3), is(3));
	}

	@Test
	public void whenIteratorCreateThenNextReturnElements() {
		Iterator<Integer> iterator = simpleList.iterator();
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(1));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(2));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(3));
		Assert.assertFalse(iterator.hasNext());
	}

	public void whenGetSizeIsTrue() {
		Assert.assertThat(simpleList.getSize(), is(3));
	}
	/**
	 * Test fail-fast behavior.
	 */
	@Test(expected = ConcurrentModificationException.class)
	public void whenCollectionModifiedThenTrowConcurrentModificationException() {
		Iterator<Integer> iterator = simpleList.iterator();
		simpleList.add(5);
		iterator.hasNext();
	}
}