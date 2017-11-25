package ru.job4j.array;
/**
 * Created by All on 25.11.2017.
 */
public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
        return array;
    }
}