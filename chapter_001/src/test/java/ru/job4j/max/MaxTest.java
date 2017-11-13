package ru.job4j.max;

import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.junit.Test;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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