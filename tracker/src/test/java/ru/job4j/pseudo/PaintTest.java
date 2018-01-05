package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 04.01.2018.
 */
public class PaintTest {
	private final PrintStream stdout = System.out; // поле содержит дефолтный вывод в консоль.
	private  final ByteArrayOutputStream out = new ByteArrayOutputStream(); //буфер для результата.

	@Before
	public void loadOutput() {
		System.out.println("execute before method");
		System.setOut(new PrintStream(this.out));
	}

	@After
	public void backOutput() {
		System.setOut(this.stdout);
		System.out.println("execute after method");
	}

	@Test
	public void whenDrawSquare() {
		new Paint().draw(new Square()); // выполняем действия пишушиее в консоль.
		// проверяем результат вычисления
		assertThat(
			new String(out.toByteArray()),
			is(
			new StringJoiner(
					System.lineSeparator(), "",
					System.lineSeparator())
					.add("++++")
					.add("+  +")
					.add("+  +")
					.add("++++")
					.toString()
			)
		);
	}
	@Test
	public void whenDrawTriangle() {
		new Paint().draw(new Triangle()); // выполняем действия пишушиее в консоль.
		// проверяем результат вычисления
		assertThat(
			new String(out.toByteArray()),
			is(
				new StringJoiner(
					System.lineSeparator(), "",
					System.lineSeparator())
					.add("  ^  ")
					.add(" ^ ^ ")
					.add("^^^^^")
					.toString()
			)
		);
	}
}
