package ru.job4j.collections.Bank_transfer;

import java.util.*;
import java.util.List;

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
		if (!userBank.containsKey(user))
		userBank.put(user, user.getAccountsList());
	}
	/*
	*Метод удаляет пользователя из хранилища
	*@param user
	*/
	public void deleteUser(User user) {
		if (userBank.containsKey(user)) {
			userBank.remove(user);
		}
	}

	public void deleteAccountFromUser(String passport, Account account) { //- удалить один счёт пользователя.
		boolean res = false;

	for (User key : userBank.keySet()) {
		if (key.getPassport().equals(passport)) {
			res = true;
		}
	}

	for (List<Account> value : userBank.values()) {
		if (value.contains(account) && res == true) {
			value.remove(account);
			}
		}
	}

	public List<Account> getUserAccounts (String passport) { //- получить список счетов для пользователя.
		List<Account> userAkk = new ArrayList<>();
		for (User key : userBank.keySet()) {
			if (key.getPassport().equals(passport)) {
				userAkk = userBank.get(key);
			}
		}
		return userAkk;
	}
	//- метод для перечисления денег с одного счёта на другой счёт:
	//если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
	public boolean transferMoney (String srcPassport, String srcRequisite, String destPassport, String destRequisite, int amount) {
		boolean result = false;
		Set<User> keys = userBank.keySet();
		Collection<List<Account>> value = userBank.values();

			for (User UserSrc : keys) {
				if (userBank.containsKey(UserSrc) && UserSrc.getPassport().equals(srcPassport)) {
						for (List<Account> list : value) {
							for (Account acc : list) {
								if (acc.getRequisit().equals(srcRequisite) && acc.getValue() >= amount) {
									int removeMoney = acc.getValue() - amount;
									acc.setValue(removeMoney);
									int numberAccount = list.indexOf(acc); //Номер аккаунта в листе.
									list.set(numberAccount, acc);
									userBank.putIfAbsent(UserSrc, list);
								}
							}
						}
					}
				if (userBank.containsKey(UserSrc) && UserSrc.getPassport().equals(destPassport)) {
					for (List<Account> list : value) {
						for (Account acc : list) {
							if (acc.getRequisit().equals(destRequisite) && (acc.getValue() + amount) > 0) {
								int removeMoney = acc.getValue() + amount;
								acc.setValue(removeMoney);
								int numberAccount = list.indexOf(acc); //Номер аккаунта в листе.
								list.set(numberAccount, acc);
								userBank.putIfAbsent(UserSrc, list);
								result = true;
							}
						}
					}
				}

			}
		return  result;
	}
}



