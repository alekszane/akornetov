package ru.job4j.collections.sort;

import java.util.Comparator;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 29.03.2018.
 */
public class ListCompare implements Comparator<String> {
/*
Метод сравнивает символы 2-х строк подобно методу String.compareTo.
*/
	@Override
	public int compare(String left, String right) {
		int a = 0;
	int lim = Math.min(left.length(), right.length());
			for (int i = 0; i < lim; i++) {
				Character c1 = left.charAt(i);
				Character c2 = right.charAt(i);
				a = Character.compare(c1, c2);
			}
		return a;
	}
}
