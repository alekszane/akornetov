package ru.job4j.array;
/**
 * Created by All on 25.11.2017.
 */
public class BubbleSort {
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			boolean sort = true; //В переменной sort храним признак того, отсортирован массив или нет
			for (int j = 0; j < i; j++) {
				//Элементы сравниваются попарно, если порядок не правильный, меняем местами
				if (array[j] > array[j + 1]) {
					int a = array[j];
					array[j] = array[j + 1];
					array[j + 1] = a;
					sort = false;
				}
			}
			if(sort) { //Если отсортирован, тогда выходим из цикла
				break;
			}
		}
		return array;
	}
}