package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 21.05.2018.
 */
public class Converter {

	public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
		return new Iterator<Integer>() {
			Iterator<Integer> iter = null;

			@Override
			public boolean hasNext() {
				boolean result = false;
				while (it.hasNext() || iter != null) {
					if (iter == null) {
						iter = it.next();
					}
					if (iter.hasNext()) {
						result = true;
						break;
					} else {
						iter = null;
					}
				}
				return result;
			}

			@Override
			public Integer next() {
				if (!this.hasNext()) {
					throw new NoSuchElementException();
				}
				return iter.next();
			}
		};
	}
}
