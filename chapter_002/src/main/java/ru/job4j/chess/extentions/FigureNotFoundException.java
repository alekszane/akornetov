package ru.job4j.chess.extentions;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class FigureNotFoundException extends Exception { //Исключение фигура не обнаружена
	public FigureNotFoundException() {
		System.out.println("Похоже, что Фигура не найдена");
	}
}
