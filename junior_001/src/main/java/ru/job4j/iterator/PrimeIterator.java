package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 18.05.2018.
 * Итератор возвращающий только простые числа.
 * Простым является натуральное число больше 1, которое делится без остатка только на 1 и на себя.
 */
public class PrimeIterator implements Iterator {
	private int[] numbers;
	private int index = 0;

	public PrimeIterator(final int[] numbers) {
		this.numbers = numbers;
	}

	private boolean isPrimeNum(int n) {
		if (n % 2 == 0 && n != 2 || n == 1) {
			return false;
		}

		int maxDiv = (int) Math.sqrt(n);
		for (int i = 3; i <= maxDiv; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
			return true;
	}

	private boolean findPrimeNum() {
		boolean res = false;

		for (; this.index < this.numbers.length; this.index++) {
			if (isPrimeNum(this.numbers[this.index])) {
				res = true;
				break;
			}
		}
		return res;
	}


	/**
	 * Returns {@code true} if the iteration has more elements.
	 * (In other words, returns {@code true} if {@link #next} would
	 * return an element rather than throwing an exception.)
	 *
	 * @return {@code true} if the iteration has more elements
	 */
	@Override
	public boolean hasNext() {
		return this.findPrimeNum();
	}

	/**
	 * Returns the next element in the iteration.
	 *
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	@Override
	public Object next() {
		boolean res = this.findPrimeNum();

		if (!res) {
			throw new NoSuchElementException();
		}

		return this.numbers[this.index++];
	}
}
