package ru.job4j.chess.extentions;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class ImposibleMoveException extends Exception { // Исключение движение фигуры не возможно!
	public ImposibleMoveException() {
	}

	public ImposibleMoveException(String message) {
		super(message);
	}

	public ImposibleMoveException(String message, Throwable cause) {
		super(message, cause);
	}

	public ImposibleMoveException(Throwable cause) {
		super(cause);
	}

	public ImposibleMoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
