package ru.job4j.collections.Bank_transfer;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 14.04.2018.
 */
public class Account { //Банковский счет.
	private int value; //(кол-во денег).
	private int requisites; //(реквизиты счёта) - это банковский счёт.

	public Account(int requisites, int value) {
		this.requisites = requisites;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public int getRequisites() {
		return requisites;
	}
}
