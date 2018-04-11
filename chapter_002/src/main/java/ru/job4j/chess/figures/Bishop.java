package ru.job4j.chess.figures;
import ru.job4j.chess.board.Cell;
import ru.job4j.chess.extentions.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public class Bishop extends Figure implements Comparable {

	private Cell[] array = new Cell[8];

	public Bishop(Cell position) {
		super(position);
	}


	@Override
	public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException {

		if (compareTo(source, dest) == 0) {
			if (compareTo(source,  dest) == 0) {
				if (source.getX() == dest.getY() && source.getX() == 0) {       // белый слон двигается из позиции 0-0 вниз по главной диагонали
					while (source.coordX() < dest.coordX() && source.coordY() < dest.coordY()) {
						returnArrayCell(source);
					}
				}
			}


			if (compareTo(source, dest) == 0 && source.getX() != 0) {         // белый слон движется по главной диагонали из позиции отличной от 0-0 ячейки шахматной доски
				while (source.coordX() <= 7) {
					returnArrayCell(source);
				}
			}

			if (compareTo(source, dest) == 0) {               // определяем положение слона на доске и по его конечной точке реализуем движение
				int a = source.coordX();
				a -= 1;
				int b = source.coordX();
				b -= 1;
				int position = 0;
				array[position] = new Cell(a, b);
				position++;
				a--;
				b--;
			}

			if (compareTo(source, dest) == 0) {
				int a = source.coordX();
				a -= 1;
				int b = source.coordY();
				b += 1;
				int position = 0;
				array[position] = new Cell(a, b);
				position++;
				a--;
				b++;
			}

			if (compareTo(source, dest) == 0) {
				int a = source.coordX();
				a += 1;
				int b = source.coordY();
				b -= 1;
				int position = 0;
				array[position] = new Cell(a, b);
				position++;
				a++;
				b--;
			}

			if (compareTo(source, dest) == 0) {
				returnArrayCell(source);
			}


			for (Cell cell : array) {
				if (cell == source) {
					throw new OccupiedWayException();
				}

			}
		}  else {
			throw  new  ImposibleMoveException();
		}
		return array;
	}

	@Override
	public Figure copy(Cell dest) {
		return new Bishop(dest);
	}

	public int compareTo(Cell source, Cell dest) {
		int tmp = 1;
		if ((dest.coordX() - source.coordX()) == (dest.coordY() - source.coordY())) {
			tmp = 0;
		}
		if ((source.coordX() - dest.coordX()) == (source.coordY() - dest.coordY())) {
			tmp = 0;
		}
		if ((dest.coordX() < source.coordX()) && (dest.coordY() < source.coordY())) {
			tmp = 0;
		}
		if ((dest.coordX() < source.coordX()) && (dest.coordY() > source.coordY())) {
			tmp = 0;
		}
		if ((dest.coordX() > source.coordX()) && (dest.coordY() > source.coordY())) {
			tmp = 0;
		}
		if ((dest.coordX() > source.coordX()) && (dest.coordY() < source.coordY())) {
			tmp = 0;
		}
		return tmp;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	public Cell[] returnArrayCell(Cell source) {
		int a = source.coordX();
		a += 1;
		int b = source.coordY();
		b += 1;
		int position = 0;

		array[position] = new Cell(a, b);
		position++;
		a++;
		b++;
		return array;
	}
}