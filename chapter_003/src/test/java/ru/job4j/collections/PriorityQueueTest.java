package ru.job4j.collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 20.02.2018.
 */
public class PriorityQueueTest {
	@Test
	public void whenHigherPriority() {
		PriorityQueue queue = new PriorityQueue();
		queue.put(new Task("low", 4));
		queue.put(new Task("hight", 1));
		queue.put(new Task("middle", 3));
		Task result = queue.take();
		assertThat(result.getDesc(), is("hight"));
	}
}
