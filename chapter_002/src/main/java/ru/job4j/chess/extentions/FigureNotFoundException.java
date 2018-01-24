package ru.job4j.chess.extentions;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class FigureNotFoundException extends Exception { //Исключение фигура не обнаружена
	public FigureNotFoundException() {
		System.out.println("Фигура не установлена на поле");
	}

	public FigureNotFoundException(String message) {
		super(message);
	}

	public FigureNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FigureNotFoundException(Throwable cause) {
		super(cause);
	}

	public FigureNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
