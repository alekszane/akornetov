package ru.job4j.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;


/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 31.07.2018.
 */
public class SetToListTest {
	private SetToList<Integer> list;
	private Iterator iterator;

	@Before
	public void setUp() {
	list = new SetToList();
	list.add(1);
	list.add(2);
	list.add(3);
	iterator = list.iterator();
	}

	@Test
	public void whenAddDuplicateThenNotAddIt() {
		Assert.assertThat(this.list.get(0), is(1));
		Assert.assertThat(this.list.get(1), is(2));
		Assert.assertThat(this.list.get(2), is(3));
		Assert.assertThat(this.list.get(3) == null, is(true));
		list.add(2);
		list.add(3);
		Assert.assertThat(this.list.get(3) == null, is(true));
	}

	@Test
	public void whenIteratorHasNextAndNext() {
		Iterator<Integer> iterator = list.iterator();
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(1));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(2));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(3));
	}
}