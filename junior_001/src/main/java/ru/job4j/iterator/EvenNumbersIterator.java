package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 17.05.2018.
 *	Программа нахождения четного числа в массиве.
 */
public class EvenNumbersIterator implements Iterator {

	private int[] numbers;
	private int index = 0;

	public EvenNumbersIterator(final int[] numbers) {
		this.numbers = numbers;
	}

	/**
	 * Ищем четные числа в массиве.
	 * @return если нашли.
	 */
	private boolean findEvenNum() {
		boolean res = false;

		for (; this.index < this.numbers.length; this.index++) {
			if ((this.numbers[this.index] % 2) == 0 && this.numbers[this.index] != 0) {
				res = true;
				break;
			}
		}
		return res;
	}

	@Override
	public boolean hasNext() {
		return this.findEvenNum();
	}

	@Override
	public Object next() {
		boolean result = this.findEvenNum();

		if (!result) {
			throw new NoSuchElementException();
		}

		return this.numbers[this.index++];
	}
}
