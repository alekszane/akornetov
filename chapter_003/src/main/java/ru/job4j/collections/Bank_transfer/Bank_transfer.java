package ru.job4j.collections.Bank_transfer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 14.04.2018.
 */
public class Bank_transfer {

	private  Map <User, List<Account>> userBank = new HashMap<>(); //Хранилище банковских счетов

	/*
	*Метод добавляет пользователя в хранилище
	*@param user
	*/
	public void addUser(User user) {
		userBank.put(user, user.getAccountsList());
	}

	public void deleteUser(User user) {

	}


	public void deleteAccountFromUser(String passport, Account account) {} //- удалить один счёт пользователя.

	public List<Account> getUserAccounts (String passport) {

		return list;
	} //- получить список счетов для пользователя.

	public boolean transferMoney (String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) //- метод для перечисления денег с одного счёта на другой счёт:
	//если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
}
