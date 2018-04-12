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

	int lim = Math.min(left.length(), right.length());
			int count = 0;
			for (int i = 0; i < lim; i++) {
				Character c1 = left.charAt(i);
				Character c2 = right.charAt(i);
				if (c1 != c2) {
					count++;
				}
			}
		return count;
	}
}
