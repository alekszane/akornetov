package ru.job4j.start;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 08.01.2018.
 */
public class MenuOutException extends RuntimeException { //Создаем исключение, которое не обрабатывается виртуальной машиной
	public MenuOutException(String message) {
		super(message);
	}

}
