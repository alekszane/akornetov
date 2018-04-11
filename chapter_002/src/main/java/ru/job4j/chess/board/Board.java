package ru.job4j.chess.board;
import ru.job4j.chess.extentions.*;
import ru.job4j.chess.figures.Figure;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
// класс реализует шахматную доску с фигурой слон
public class Board  {

	private  Figure[][] figures = new Figure[8][8];

	public Figure[][] fillFigures(int i, int j, Figure figure) throws FigureNotFoundException {

		figures[i][j] = figure;
		if (figures [i][j] == figure) {
			System.out.println("");
		} else {
			throw  new FigureNotFoundException();
		}
		return figures;
	}

	public boolean testArray(Cell source) throws FigureNotFoundException {
		int a = source.coordX();
		int b = source.coordY();
		boolean tmp = false;
		if ((figures[a][b]) != null) {
			tmp = true;
		} else {
			throw new FigureNotFoundException();
		}
		return tmp;
	}

	public Board() {

	}

	public boolean move(Cell source, Cell dest, Figure figure)  {

		int one = source.coordX();
		int two = source.coordX();
		Cell[]test = new Cell[8];
		boolean testCondition = false;

		try {
			test = figure.way(source, dest);
		} catch (OccupiedWayException o) {
			System.out.println("The way is occupied");
		} catch (ImposibleMoveException i) {
			System.out.println("The move is impossible");
		}
		figure.copy(dest);
		testCondition = true;
		return testCondition;
	}
}