package ru.job4j.coffemachine;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 28.01.2018.
 */
public class CoffeMachineTest {

	@Test
	public void whenPutMoneyThenGetCofeeAndCoin() {
		//Создаем объект класса
		CoffeMachine machine = new CoffeMachine(50, 21);
		int[] result = {10, 10, 5, 2, 2};
		assertThat(machine.changes(machine.getValue(), machine.getPrice()), is(result));
	}
}
