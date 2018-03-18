package ru.job4j.chess.figures;
import ru.job4j.chess.board.Cell;
import ru.job4j.chess.extentions.*;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 17.01.2018.
 */
public abstract class Figure { //Абстрактный класс, создаем на его основе другие фигуры.

	private final Cell position;

	public Figure(Cell position) {
		this.position = position;
	}

	public abstract Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException;

	public abstract Figure copy(Cell dest);

}
