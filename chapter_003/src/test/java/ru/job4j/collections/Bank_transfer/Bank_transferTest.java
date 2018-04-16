package ru.job4j.collections.Bank_transfer;

import org.junit.Test;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 16.04.2018.
 */
public class Bank_transferTest {
	@Test
	public void whenAddUserThenWell() {
		Bank_transfer bank = new Bank_transfer();
		User user1 = new User("Василий", "58 10 111 898");
		Account account = new Account(user1.hashCode(), 100000);
		user1.addAccountToUser(user1.getPassport(), account);

	}
}
