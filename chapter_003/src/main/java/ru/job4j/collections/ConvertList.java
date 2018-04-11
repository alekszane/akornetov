package ru.job4j.collections;

import java.util.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 27.02.2018.
 */
public class ConvertList {

/*- метод конвертирует двумерный массив в ArrayList.
	@param Integer[][] array
	@return ArrayList list */

	public List<Integer> toList(Integer[][] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int x : array[i]) {
				list.add(x);
			}
		}
		return list;
	}

/*- метод toArray разбивает лист на количество (rows) строк двумерного массива.
	Например в результате конвертации листа со значениями (1,2,3,4,5,6,7) с разбиением на
	3 строки должен получиться двумерный массив {{1, 2, 3} {4, 5, 6} {7, 0 ,0}}
	@param List<Integer> list, int rows
	@return Integer[][]*/

	public Integer[][] toArray(List<Integer> list, int rows) {
	List<Integer> copy;
		copy = list; // Исключаем падение программы при передаче  fixed-size (Arrays.asList()) или unmodifiableList
		int cols = rows;
		Integer[][] result = new Integer[rows][cols];
		addZero(copy, rows);
		int listSize = list.size();

		Integer[] res = new Integer[listSize];
		copy.toArray(res);
		int count = 0;
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = res[count++];
				}
			}
		return result;
	}
 /* Метод добавляет нули в List<Integer> list созласно числу рядов (rows)
 @param List<Integer> list, int rows
 @return List<Integer> list.
  */
	public List<Integer> addZero(List<Integer> list, int rows) {
		while (list.size() % rows != 0) {
			list.add(0);
		}
		return list;
	}
	/* Метод конвертирует массив List<int[] в List<Integer>.
		@param  List<int[]> list
		@return List<Integer> list
	  */
	public List<Integer> convert(List<int[]> list) {
		List<Integer> result = new ArrayList<>();
		for (int[] tmp : list) {
			for (int i : tmp) {
				result.add(i);
			}
		}
		return result;
	}
}

