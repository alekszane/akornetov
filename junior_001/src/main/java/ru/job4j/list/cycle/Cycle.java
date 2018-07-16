package ru.job4j.list.cycle;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 05.07.2018.
 */
public class Cycle {
	public boolean hasCycle(Node first) {
	boolean res = false;
		if (first != null && first.next != null && first.next.next != null) {
			Node second = first.next.next;
			while (second != null && second.next != null) {
				if (first == second) {
					res = true;
					break;
				}
				first = first.next;
				second = second.next.next;
			}
		}
	return res;
	}
}
