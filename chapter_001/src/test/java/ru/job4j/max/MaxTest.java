package ru.job4j.max;

public class MaxTest {
	/**
     * Тест Max
     */
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
}