package ru.job4j.loop;

/**
 * Created by All on 20.11.2017.
 */

public class Counter {
    int sum;
    public int add(int start, int finish) {
        for (int i = 0; i <= 10; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        } return sum;
    }
}
