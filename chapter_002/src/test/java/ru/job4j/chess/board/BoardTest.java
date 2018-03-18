package ru.job4j.chess.board;

import org.junit.Test;
import ru.job4j.chess.figures.Bishop;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project chapter_002
 *         Created on 22.01.2018.
 */
public class BoardTest {
	@Test
	public void testBoard()  {
		Board board = new Board();
		Cell source = new Cell(0, 0);
		Cell dest = new Cell(5, 5);
		Figure figure = new Bishop();
		board.addFigure(source, figure);
		boolean two = board.move(source, dest);
		boolean one = true;
		assertThat(true, is(two));
	}
}
