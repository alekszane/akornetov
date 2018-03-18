package ru.job4j.chess.figures;
import ru.job4j.chess.board.Cell;
import ru.job4j.chess.extentions.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class Bishop implements Figure {

	@Override
	public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException {

	if (source == null && dest != null){

		for (Cell a : array) {

		}

		source = step;


	}
	/*int[] x = {};
	int x1 = source.getX();
	int y1 = source.getY();
	int x2 = dest.getX();
	int y2 = dest.getY();

	if ((x2 - x1) == (y2 - y1) || (x1 - x2) == (y1 - y2) || (x1 - x2) == (y2 - y1) || (x2 - x1) == (y2 - y1)) {

		if (x1 == y1 && x1 == 0) {       // белый слон двигается из позиции 0-0 вниз по главной диагонали
			x1 += 1;
			y1 += 1;
			int position = 0;
			while (x1 < dest.getX() && y1 < dest.getY()) {
				array[position] = new ru.job4j.chess.board.Cell(x1, y1);
				position++;
				x1++;
				y1++;
			}
		}

		if (x1 == y1 && x1 != 0) {         // белый слон движется по главной диагонали из позиции отличной от 0-0 ячейки шахматной доски
			while (x1 <= 7) {
				int position = 0;
				x1 += 1;
				y1 += 1;
				array[position] = new ru.job4j.chess.board.Cell(x1, y1);
				position++;
				x1++;
				y1++;
			}
		}

		if (x2 < x1 && y2 < y1) {               // определяем положение слона на доске и по его конечной точке.
			int position = 0;
			x1 -= 1;
			y1 -= 1;
			array[position] = new ru.job4j.chess.board.Cell(x1, y1);
			position++;
			x1--;
			y1--;
		}

		if (x2 < x1 && y2 > y1) {
			int position = 0;
			x1 -= 1;
			y1 += 1;
			array[position] = Cell(x1, y1);
			position++;
			x1--;
			y1++;
		}

		if (x2 > x1 && y2 > y1) {
			int position = 0;
			x1 += 1;
			y1 -= 1;
			array[position] = new ru.job4j.chess.board.Cell(x1, y1);
			position++;
			x1++;
			y1--;
		}

		if (x2 > x1 && y2 > y1) {
			int position = 0;
			x1 += 1;
			y1 += 1;
			array[position] = new ru.job4j.chess.board.Cell(x1, y1);
			position++;
			x1++;
			y1++;
		}

		for (Cell cell : array) {
			if (cell == source) {
				throw new OccupiedWayException();
			}
		}
	} else {
		throw new ImposibleMoveException();
	}
	return array;*/

	}


	@Override
	public Figure copy(Cell dest) {
		return new Bishop(dest);
	}
}
