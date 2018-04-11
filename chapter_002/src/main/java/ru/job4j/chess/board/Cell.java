package ru.job4j.chess.board;

import ru.job4j.chess.figures.Figure;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
// класс создает ячейку с координатами фигуры . Напримере слона .

public class Cell {
	private int x;
	private int y;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int coordX() {
		return this.x;
	}

	public int coordY() {
		return this.y;
	}

	public int getY() {
		return y;
	}

	public int getX() {

		return x;
	}

}