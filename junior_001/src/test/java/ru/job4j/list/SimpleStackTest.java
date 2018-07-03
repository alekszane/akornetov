package ru.job4j.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 25.06.2018.
 */
public class SimpleStackTest {
	private SimpleStack<Integer> stack = new SimpleStack<>();


	@Test
	public void whenPollElementStackThenGetThisAndDelete() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Assert.assertThat(stack.poll(), is(3));
		Assert.assertThat(stack.poll(), is(2));
		Assert.assertThat(stack.poll(), is(1));
	}
}