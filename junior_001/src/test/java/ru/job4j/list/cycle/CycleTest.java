package ru.job4j.list.cycle;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 09.07.2018.
 */
public class CycleTest {
		private Node first = new Node(1);
		private Node two = new Node(2);
		private Node third = new Node(3);
		private Node four = new Node(4);
		private Cycle cycle = new Cycle();

		@Test
		public void  oneCycleTest() {
			first.next = two;
			two.next = third;
			third.next = four;
			four.next = first;
			assertThat(cycle.hasCycle(first), is(true));
		}

		@Test
		public void twoCycleTest() {
			first.next = two;
			two.next = third;
			third.next = two;
			four.next = null;
			assertThat(cycle.hasCycle(first), is(true));
		}

		@Test
		public void threeCycleTest() {
			first.next = two;
			two.next = third;
			third.next = four;
			four.next = two;
			assertThat(cycle.hasCycle(first), is(true));
		}

		@Test
		public void fourCycleTest() {
			first.next = two;
			two.next = four;
			third.next = first;
			four.next = third;
			assertThat(cycle.hasCycle(first), is(true));
		}

		@Test
		public void fiveCycleTest() {
			first.next = two;
			two.next = third;
			third.next = four;
			four.next = null;
			assertThat(cycle.hasCycle(first), is(false));
		}

		@Test
		public void shouldReturnFalse() {
			Node<Integer> n1 = new Node<>(1);
			Node<Integer> n2 = new Node<>(2);
			Node<Integer> n3 = new Node<>(3);
			Node<Integer> n4 = new Node<>(4);
			Node<Integer> n5 = new Node<>(5);
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n5;
			Cycle c = new Cycle();
			assertThat(c.hasCycle(n1), is(false));
		}
	}