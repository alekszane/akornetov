package ru.job4j.coffemachine;

import java.util.Arrays;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 28.01.2018.
 */
public class CoffeMachine {

	private int value; //Купюра 50, 100 руб.
	private int price; // Цена на кофе.
	private int[] coins = {10, 5, 2, 1}; // Массив номиналов монет.

	public CoffeMachine(int value, int price) {
		this.value = value;
		this.price = price;
	}

	public int getValue() {
		return this.value;
	}

	public int getPrice() {
		return this.price;
	}

	public int[] changes(int value, int price) {
		int handing = value - price; //Колличество денег для выдачи.
		int[] result = new int[5]; // Массив возвращаемых монет.
		int j = 0;
		for (int i : coins) {
			while (handing - i >= 0) {
				handing -= i;
				result[j] = i;
				j++;
			}
		}
		return result;
	}
}






