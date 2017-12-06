package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by All on 07.12.2017.
 */
public class ArrayAddTest {
	@Test
	public void whenArrayPlusElementThenAddArray() {
		//тест, проверяющий поворот массива размером 2 на 2.
		ArrayAdd add = new ArrayAdd();
		assertThat(add.addElement((new int[]{1, 3, 4}), 5), is(new int[]{1, 3, 4, 5}));
	}
}
