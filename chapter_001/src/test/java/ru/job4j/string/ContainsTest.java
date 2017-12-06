package ru.job4j.string;

import org.junit.Test;
<<<<<<< HEAD
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
=======

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

>>>>>>> c21f47e133e68bdf441eee61c65381aca7a22e6a
/**
 * Created by All on 04.12.2017.
 */
public class ContainsTest {
	@Test
	public void whenStringOriginContainIncludeStringSubThenTrue() {
		Contains stringContains = new Contains();
		boolean rsl = stringContains.contains("HELLO", "ELL");
		assertThat(rsl, is(true));
	}
	@Test
	public void whenStringOriginContainIncludeStringSubNewThenTrue() {
		Contains stringContains = new Contains();
<<<<<<< HEAD
		boolean rsl = stringContains.contains("ab cd ef g", "ef");
		assertThat(rsl, is(true));
	}
	@Test
	public void whenStringOriginContainIncludeStringSubNewThenFalse() {
		Contains stringContains = new Contains();
		boolean rsl = stringContains.contains("ab cd ef g", "xy");
		assertThat(rsl, is(false));
	}
=======
		boolean rsl = stringContains.contains("ab cd ef", "ef");
		assertThat(rsl, is(true));
	}
>>>>>>> c21f47e133e68bdf441eee61c65381aca7a22e6a
}
