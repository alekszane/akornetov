package ru.job4j.chess.board;
import ru.job4j.chess.extentions.*;
import ru.job4j.chess.figures.Figure;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class Board {

	private Cell source; // Начальная ячейка.
	private Cell dest; // Конечная ячейка.
	private Figure[][] figures; //Массив фигур (ячеек).
	private Figure figure; //Фигура  Слон


	public Board(Cell source, Cell dest, Figure[][] figures, Figure figure) {
		this.source = source;
		this.dest = dest;
		this.figures = figures;
		this.figure = figure;
	}

	public void addFigure(Figure figure) {
		if (figure != null) {
			this.figure = figure;
		}
	}

	public void setFigure(int x, int y) { //метод реализует установку в ячейку фигуры figure.
		figures[x][y] = this.figure;
	}

	public boolean move(Cell source, Cell dest)  {
		boolean result = false;
		int one = source.getX();
		int two = source.getX();
		Cell[]test = new Cell[8];
			try {
				if (testPositionFigure(this.source)) {
					result = true;
				}
			} catch (FigureNotFoundException f) {
				System.out.println("NotFoundException");
			}

			try {
				test = figure.way(source, dest);
			} catch (OccupiedWayException o) {
				System.out.println("The way is occupied");
			} catch (ImposibleMoveException i) {
				System.out.println("The move is impossible");
			}

		figure.copy(dest);
		result = true;
		return result;
	}

	public boolean testPositionFigure(Cell source) throws FigureNotFoundException {
		boolean result = false;
		int a = source.getX();
		int b = source.getY();
		if (figures[a][b] != null) {
			result = true;
		} else {
			throw  new  FigureNotFoundException();
		}
		return result;
	}

}
