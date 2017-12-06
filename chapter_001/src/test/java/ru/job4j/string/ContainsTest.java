package ru.job4j.string;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
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
		boolean rsl = stringContains.contains("ab cd ef g", "ef");
		assertThat(rsl, is(true));
	}
	@Test
	public void whenStringOriginContainIncludeStringSubNewThenFalse() {
		Contains stringContains = new Contains();
		boolean rsl = stringContains.contains("ab cd ef g", "xz");
		assertThat(rsl, is(false));
	}

}
