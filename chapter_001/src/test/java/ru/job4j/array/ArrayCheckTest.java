package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 08.12.2017.
 */
public class ArrayCheckTest {
	//тест, проверяющий отсортирован ли массив из 9 элементов или нет.
	@Test
	public void whenArrayCheckWithNineElementsThenTrue() {
		ArrayCheck array = new ArrayCheck();
		assertThat(array.isSorted(new int[]{0, 1, 2, 3, 4, 5, 5, 7, 8}), is(true));
	}
	@Test
	public void whenArrayCheckWithNineElementsThenFalse() {
		ArrayCheck array = new ArrayCheck();
		assertThat(array.isSorted(new int[]{0, 4, 2, 9, 3, 10, 1, 7, 5}), is(false));
	}


}
