package ru.job4j.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 03.07.2018.
 */
public class SimpleQueueTest {
	private  SimpleQueue<Integer> queue = new SimpleQueue<>();
	@Before
	public void setUp() {
		queue.push(1);
		queue.push(2);
		queue.push(3);
	}
	@Test
	public void whenPollThenReturnFirstAddedElementAndRemoveIt() {

		Assert.assertThat(queue.poll(), is(1));
		Assert.assertThat(queue.poll(), is(2));
		Assert.assertThat(queue.poll(), is(3));
	}

}