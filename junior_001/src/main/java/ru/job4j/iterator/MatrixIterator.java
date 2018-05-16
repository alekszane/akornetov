package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 14.05.2018.
 */
public class MatrixIterator implements Iterator {

	private final int[][] value;
	private int x = 0; // Считаем позицию в столбце.
	private int y = 0; // Считаем позицию в ряде.


	public MatrixIterator(int[][] value) {
		this.value = value;
	}

	@Override
	public boolean hasNext() {
		int xLength = value.length; // Колличетво столбцов.
		int yLength = value[xLength - 1].length; // Колличество элементов в строке.
		return value.length > x && yLength >= y;
	}
	  /*
	  * Метод реализует перевод каретки к следующему элементу массива.
	  */
	@Override
	public Object next() {
		int result;

	if (value.length == 0) {
		throw new NoSuchElementException();
	}
		int yLength = value[x].length;
		result = value[x][y++];

			if (y == yLength) {
				x++;
				y = 0;
			}
		return result;
	}
}
