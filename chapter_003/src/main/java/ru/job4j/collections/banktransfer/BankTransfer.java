package ru.job4j.collections.banktransfer;

import java.util.*;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 14.04.2018.
 */
public class BankTransfer {

	private  Map<User, List<Account>> userBank = new HashMap<>(); //Хранилище банковских счетов


	/*
		*Метод добавляет пользователя в хранилище
		*@param user
		*/
	public void addUser(User user) {
		userBank.putIfAbsent(user, user.getUserAccount());
	}
	/*
	*Метод удаляет пользователя из хранилища
	*@param user
	*/
	public void deleteUser(User user) {
			userBank.remove(user);
	}

	public void deleteAccountFromUser(String passport, Account account) { //- удалить один счёт пользователя.

			getUserAccounts(passport).remove(account);
	}

	public List<Account> getUserAccounts(String passport) { //- получить список счетов для пользователя.
		List<Account> userAkk = new ArrayList<>();
		for (User key : userBank.keySet()) {
			if (key.getPassport().equals(passport)) {
				userAkk = key.getUserAccount();
				break;
			}
		}
		return userAkk;
	}
	//- метод для перечисления денег с одного счёта на другой счёт:
	//если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
	public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, int amount) {
		boolean result = false;
		Set<User> keys = userBank.keySet();
		Collection<List<Account>> value = userBank.values();

			for (User userSrc : keys) {
				if (userBank.containsKey(userSrc) && userSrc.getPassport().equals(srcPassport)) {
						for (List<Account> list : value) {
							for (Account acc : list) {
								if (acc.getRequisit().equals(srcRequisite) && acc.getValue() >= amount) {
									int removeMoney = acc.getValue() - amount;
									acc.setValue(removeMoney);
									int numberAccount = list.indexOf(acc); //Номер аккаунта в листе.
									list.set(numberAccount, acc);
									userBank.putIfAbsent(userSrc, list);
								}
							}
						}
					}
				if (userBank.containsKey(userSrc) && userSrc.getPassport().equals(destPassport)) {
					for (List<Account> list : value) {
						for (Account acc : list) {
							if (acc.getRequisit().equals(destRequisite) && (acc.getValue() + amount) > 0) {
								int removeMoney = acc.getValue() + amount;
								acc.setValue(removeMoney);
								int numberAccount = list.indexOf(acc); //Номер аккаунта в листе.
								list.set(numberAccount, acc);
								userBank.putIfAbsent(userSrc, list);
								result = true;
							}
						}
					}
				}

			}
		return  result;
	}
}



