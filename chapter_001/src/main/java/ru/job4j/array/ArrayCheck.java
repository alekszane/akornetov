package ru.job4j.array;
/**
 * Created by All on 08.12.2017.
 */
public class ArrayCheck {
	public boolean isSorted(int[] arr, boolean check) {
		boolean result = true;
		if (check == false) {
			for (int i = 0; i < arr.length - 1; ++i) {
				if (arr[i] > arr[i + 1]) {
					result = false;
				}
			}
		}
		return result;
	}
}
