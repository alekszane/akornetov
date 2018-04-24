package ru.job4j.collections.Bank_transfer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 16.04.2018.
 */
public class Bank_transferTest {
	@Test
	public void whenGetUserAccountThenWell() {
		User user1 = new User("Василий", "58 10 111 898");
		User user2 = new User("Сергей", "58 10 222 333");

		Account account1 = new Account("123456", 100000);
		Account account2 = new Account("326546461", 1000);

		user1.addAccountToUser("58 10 111 898", account1);
		user2.addAccountToUser("58 10 222 333", account2);

		List<Account> test = new ArrayList<>();
		test.add(account1);
		Bank_transfer bank = new Bank_transfer();

		bank.addUser(user1);
		bank.addUser(user2);
		Assert.assertThat(test, is(bank.getUserAccounts("58 10 111 898")));
	}

	@Test
	public void whenTransferMonyFromTwoUsersInManyThread() {
		Bank_transfer bank = new Bank_transfer();

		User a = new User("Василий", "58 10 111 898");
		User b = new User("Сергей", "58 10 222 333");
		User c = new User("Андрей", "58 14 333 444");

		Account act1 = new Account("11111", 100000);
		Account act2 = new Account("22222", 1000);
		Account act3 = new Account("33333", 100);
		Account act4 = new Account("44444", 100);

		a.addAccountToUser("58 10 111 898", act1);
		a.addAccountToUser("58 10 111 898", act4);
		b.addAccountToUser("58 10 222 333", act2);
		c.addAccountToUser("58 14 333 444", act3);

		bank.addUser(a);
		bank.addUser(b);
		bank.addUser(c);

		boolean test = bank.transferMoney("58 10 111 898", "11111", "58 10 222 333", "22222", 520);
		Assert.assertThat(true, is(test));
	}
}
