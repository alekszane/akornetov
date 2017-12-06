package ru.job4j.array;

/**
 * Created by All on 07.12.2017.
 */
public class ArrayAdd {
	public int[] addElement(int[] array, int value) {
		int[] newArray = new int[array.length + 1];

		for (int i = 0; i < newArray.length; i++) {
			if (i < array.length){
				newArray[i] = array[i];
			} else {
				newArray[i] = value;
			}
		}
		return  newArray;
	}
}
