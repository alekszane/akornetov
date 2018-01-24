package ru.job4j.chess.extentions;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class OccupiedWayException extends Exception { //Исключение путь на доске занят другими фигурами

	public OccupiedWayException() {
	}

	public OccupiedWayException(String message) {
		super(message);
	}

	public OccupiedWayException(String message, Throwable cause) {
		super(message, cause);
	}

	public OccupiedWayException(Throwable cause) {
		super(cause);
	}

	public OccupiedWayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}