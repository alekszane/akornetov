package ru.job4j.loop;
/**
 * Created by All on 21.11.2017.
 */
public class Factorial {
    int res = 1;
    //Метод возвращает факториал положительных чисел
    public int calc(int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
        }
        return res; // Возвращаем Результат вычислений
    }
}
