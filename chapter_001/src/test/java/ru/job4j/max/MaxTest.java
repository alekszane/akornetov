package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	/**
     * Тест Max
     */
	//Создаем объект, и передаем в него числа
	//assertThat Возвращает результат
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
	//Создаем объект, и передаем в него числа
	//assertThat Возвращает результат
	@Test
	public void whenFirstMoreSecondAndThird() {
		Max maxim = new Max();
		int result = maxim.max(3, 2, 1);
		assertThat(result, is(3));
	}
}