package ru.job4j.collections.banktransfer;

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

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (this == obj && getClass() == obj.getClass()) {
			res = true;
		}
		return res;
	}

	@Override
	public int hashCode() {
		return requisit.hashCode();
	}
}
