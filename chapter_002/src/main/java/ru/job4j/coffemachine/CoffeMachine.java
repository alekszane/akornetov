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

	private int coin10, coin5, coin2, coin1; // Монеты.

	//private int[] nominalCoin = {10, 5, 2, 1};


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

	public int[] changes(int value, int price) { //

		int handing = value - price; //Колличество денег для выдачи

		//Разбиваем сдачу на монеты.

				if (handing >= 10) {
					coin10 = handing / 10;
					handing -= (coin10 * 10);
				}
				if (handing >= 5) {
					coin5 = handing / 5;
					handing -= (coin5 * 5);
				}
				if (handing >= 2) {
					coin2 = handing / 2;
					handing -= (coin2 * 2);
				}
				 if (handing == 1) {
			coin1 = handing;
				}

		int countCoin = coin10 + coin5 + coin2 + coin1; // Считаем колличество монет.

		int[] numCoin = new int[countCoin]; // Массив с монетами для выдачи.

			// Заполняем ячейки массива
		if (coin10 != 0) {
				for (int i = 0; i < numCoin.length; i++) {
						numCoin[i] = 10;
						if (i == coin10 - 1) {
						break;
						}
					}
				}
		if (coin5 != 0) {
			for (int i = coin10; i < numCoin.length; i++) {
				numCoin[i] = 5;
				if (i == coin10 + coin5) {
					break;
				}
			}
		}
		if (coin2 != 0) {
			for (int i = coin10 + coin5; i < numCoin.length; i++) {
				numCoin[i] = 2;
				if (i == coin10 + coin5 + coin2) {
					break;
				}
			}
		}
		if (coin1 != 0) {
			for (int i = coin10 + coin5 + coin2; i < numCoin.length; i++) {
				numCoin[i] = 1;
				if (i == coin10 + coin5 + coin2 + coin1) {
					break;
				}
			}
		}
				Arrays.sort(numCoin); // Сортируем массив

				for (int x = 0; x <numCoin.length / 2; x++) { //Выводим в обр. порядке
					int tmp = numCoin[x];
					numCoin[x] = numCoin[numCoin.length - 1 - x];
					numCoin[numCoin.length - 1 - x] = tmp;
				}

			return 	numCoin;
	}
}





