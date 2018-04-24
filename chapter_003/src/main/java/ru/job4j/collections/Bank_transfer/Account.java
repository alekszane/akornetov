package ru.job4j.collections.Bank_transfer;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 14.04.2018.
 */
public class Account { //Банковский счет.
	private int value; //(кол-во денег).
	private String requisit; //(реквизиты счёта) - это банковский счёт.

	public Account(String requisites, int value) {
		this.requisit = requisites;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getRequisit() {
		return requisit;
	}
}
