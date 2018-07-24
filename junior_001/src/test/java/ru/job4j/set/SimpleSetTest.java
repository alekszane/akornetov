package ru.job4j.set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 12.07.2018.
 */
public class SimpleSetTest {
	private SimpleSet<Integer> simpleSet = new SimpleSet<>();

	@Before
	public void setUp() {
		simpleSet.add(1);
		simpleSet.add(2);
		simpleSet.add(3);
	}
	@Test
	public void whenAddDuplicateThenNotAddIt() {
		Assert.assertThat(this.simpleSet.get(0), is(1));
		Assert.assertThat(this.simpleSet.get(1), is(2));
		Assert.assertThat(this.simpleSet.get(2), is(3));
	}

	@Test
	public void whenIteratorHasNextAndNext() {
		Iterator<Integer> iterator = simpleSet.iterator();
		Assert.assertTrue(iterator.hasNext());
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(1));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(2));
		Assert.assertTrue(iterator.hasNext());
		Assert.assertThat(iterator.next(), is(3));
	}
}