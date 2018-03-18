package ru.job4j.chess.extentions;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class ImposibleMoveException extends Exception { // Исключение движение фигуры не возможно!
	public ImposibleMoveException() {
		System.out.println("движение фигуры не возможно!");
	}

}
