package ru.job4j.chess.board;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class Cell {

	private String name; //Имя(идентификатор) ячейки

	/**
	 * Конструктор ячейки поля, создаем с указанием имени(идентификатора) ячейки.
	 * @param name
	 */
	Cell(String name) {
		this.name = name;
	}

	/**
	 * Вызов имени ячейки.
	 * @return String name
	 */
	public String getName() {
		return this.name;
	}
}