package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 * project tracker
 * Created on 03.01.2018.
 */
public class SquareTest {
	@Test
	public void whenDrawSquare() { //Тестируем отрисовку квадрата c выводом в память.
		PrintStream stdout = System.out; // получаем ссылку на стандартный вывод в консоль.
		ByteArrayOutputStream out = new ByteArrayOutputStream(); // Создаем буфур для хранения вывода.
		System.setOut(new PrintStream(out)); //Заменяем стандартный вывод на вывод в пямять для тестирования.
		new Paint().draw(new Square()); // выполняем действия пишушиее в консоль.
		// проверяем результат вычисления
		assertThat(
				new String(out.toByteArray()),
			is(
				new StringBuilder()
					.append("++++\n")
					.append("+  +\n")
					.append("+  +\n")
					.append("++++\r\n")
					.toString()
			)
		);
	}
}
