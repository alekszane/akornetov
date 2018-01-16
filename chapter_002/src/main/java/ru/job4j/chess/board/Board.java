package ru.job4j.chess.board;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class Board {

	private final int BOARD_CELL = 8; //Размер доски.

	private Cell[][] board = new Cell[BOARD_CELL][BOARD_CELL]; // сама игровая доска.

	private char[] horizontNames = new char[BOARD_CELL]; //Именование ячеек по горизонтали доски.

	private char[] vertivalNames = new char[BOARD_CELL]; //Именование ячеек по вертикали доски.

	Board(){

		for(int size = 0; size < this.BOARD_CELL; size++){ //Заполняем массив алфавитом по порядку.
			this.horizontNames[size] = (char)((int)'a' + size);
		}
		for(int size = 0; size < this.BOARD_CELL; size++){ //Заполняем массив номерами по порядку.
			this.vertivalNames[size] = (char)((int)'1' + size);
		}

		for(int i = 0; i < BOARD_CELL; i++){ //Создаем ячейки поля - присваиваем им имена.
			for(int j = 0; j < BOARD_CELL; j++){

				String name = String.valueOf(this.horizontNames[j]) + String.valueOf(this.vertivalNames[i]);
				board[i][j] = new Cell(name);
			}
		}
	}

	public static void main(String[] args) {

		Board board = new Board();
	}
}
