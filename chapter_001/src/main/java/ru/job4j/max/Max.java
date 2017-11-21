package ru.job4j.max;
/*Класс Max*/
public class Max {
    //Метод возвращает максимум из 2х чисел
    public int max(int first, int second) {
        return (first < second) ? second : first;
    }
    //Метод возвращает максимум из 3-х чисел
   public int max(int first, int second, int third) {
       return max(third, max(first, second));
        }
    }