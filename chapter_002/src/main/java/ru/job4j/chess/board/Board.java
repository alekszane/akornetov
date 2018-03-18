package ru.job4j.chess.board;
import ru.job4j.chess.extentions.*;
import ru.job4j.chess.figures.Figure;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class Board {

	private Figure[][] figures = new Figure[8][8];

	public Board() {}

	public boolean addFigure(Cell source, Figure figure) throws ImposibleMoveException {
		boolean res = false;
		figures[source.getX()][source.getY()] = figure;
		if (figure == null) {
			res = true;
		} else {
			throw new ImposibleMoveException();
		}
		return res;
	}


	public boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
		boolean result = false;
			try {
				if (figures(this.source)) {
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


}
