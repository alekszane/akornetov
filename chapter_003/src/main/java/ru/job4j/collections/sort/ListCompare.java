package ru.job4j.collections.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 29.03.2018.
 */
public class ListCompare implements Comparator<String> {

	@Override
	public int compare(String left, String right) {
		//char[] v1 = left.toCharArray();
		//char[] v2 = right.toCharArray();

		int lim = Math.min(left.length(), right.length());
		int count = 0;
			if (left.length()!= right.length()) {
				int res = Integer.compare(left.length(), right.length());
				return  res;
			}
		if (left.length() == right.length()) {

			for (int i = 0; i < lim; i++) {
				Character c1 = left.charAt(i);
				Character c2 = right.charAt(i);
				if (!c1.equals(c2)) {
					count++;
				}
			}

		}
		return count;
	}
}
