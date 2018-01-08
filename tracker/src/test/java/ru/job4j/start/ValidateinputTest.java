package ru.job4j.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 08.01.2018.
 */
public class ValidateinputTest {
	private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
	private final PrintStream out = System.out;

	@Before
	public void loadMem() {
		System.setOut(new PrintStream(this.mem));
	}

	@After
	public void loadSys() {
		System.setOut(this.out);
	}

	@Test
	public void whenInvalidInput() {
		ValidateInput input = new ValidateInput(
				new StubInput(new String[] {"invalid", "1"})
		);
		input.ask("Enter", new int[] {1});
		assertThat(
				this.mem.toString(),
				is(
						String.format("Please enter validate data again.%n")
				)
		);
	}
}
