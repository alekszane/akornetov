package ru.job4j.chess.extentions;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class OccupiedWayException extends Exception { //Исключение путь на доске занят другими фигурами

	public OccupiedWayException() {
		System.out.println("Путь занят другими фигурами");
	}

}