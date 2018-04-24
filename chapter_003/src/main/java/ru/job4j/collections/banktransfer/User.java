package ru.job4j.collections.banktransfer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 13.04.2018.
 */
public class User {

private String name; // Имя.
private String passport; // Паспортные данные.
private List<Account> accountsList = new ArrayList<>(); // Лист счетов пользователя.


public User(String name, String passport) {
	this.name = name;
	this.passport = passport;
}

	public String getName() {
		return name;
	}

	public String getPassport() {
		return  passport;
	}


	public void setPassport(String data) {
		this.passport = data;
	}

	public List<Account> getAccountsList() {
		return accountsList;
	}

	public void addAccountToUser(String passport, Account account) { //- добавить счёт пользователю.
		if (this.getPassport().equals(passport)) {
			accountsList.add(account);
		}
	}

	@Override
	public boolean equals(Object o) {
		boolean res = false;
		if (this == o && getClass() == o.getClass()) {
		res = true;
		}
		return res;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
