package ru.job4j.array;
/**
 * Created by All on 08.12.2017.
 */
public class ArrayCheck {
	public boolean isSorted(int[] arr, boolean check) {
		if (check == false) {
			for (int i = 0; i < arr.length - 1; ++i) {
				if (arr[i] > arr[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}
}
