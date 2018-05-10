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

	/**
	 *Метод добавляет пользователя в хранилище
	 *@param user
	 */
	public void addUser(User user) {
		userBank.putIfAbsent(user, user.getUserAccount());
	}

	/**
	*Метод удаляет пользователя из хранилища
	* @param user
	*/
	public void deleteUser(User user) {
			userBank.remove(user);
	}

	/**
	*Метод удаляет пользователя из хранилища
	* @param passport
	* @param account
	*/
	public void deleteAccountFromUser(String passport, Account account) {
			getUserAccounts(passport).remove(account);
	}

	/**
	 * Метод позволяет получить список счетов для пользователя.
	 * @param passport
	 * @return Account
	 */
	public List<Account> getUserAccounts(String passport) {
		List<Account> userAkk = new ArrayList<>();
		for (User key : userBank.keySet()) {
			if (key.getPassport().equals(passport)) {
				userAkk = key.getUserAccount();
				break;
			}
		}
		return userAkk;
	}
	/* метод для  поиска аккаунта по реквизитам.
	* @param requisite.
	* @return Account.
	*/
	private Account searchAccountToRequisite(String requisite) {
		Collection<List<Account>> value = userBank.values();
		Account account = new Account(" ", 0);

		for (List<Account> list : value) {
			for (Account acc : list) {
					if (acc.getRequisit().equals(requisite)) {
						account = acc;
					}
				}
			}
			return account;
	}
	/** метод для перечисления денег с одного счёта на другой счёт:
	* если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
	* @param srcPassport
	* @param srcRequisite
	* @param destPassport
	* @param destRequisite
	* @param amount
	* @return boolean
	*/
	public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, int amount) {
		boolean result = false;
		Set<User> keys = userBank.keySet();
		Account account;

			for (User userSrc : keys) {
				if (userSrc.getPassport().equals(srcPassport)) {
					account = searchAccountToRequisite(srcRequisite);
					if ((account.getValue() - amount) > 0) {
						int removeMoney = account.getValue() - amount;
						account.setValue(removeMoney);
					}
				}

				if (userSrc.getPassport().equals(destPassport)) {
					account = searchAccountToRequisite(destRequisite);
					if ((account.getValue() + amount) > 0) {
						int addMoney = account.getValue() + amount;
						account.setValue(addMoney);
						result = true;
						System.out.println(account.getValue());
					}
				}
			}
		return  result;
	}
}



