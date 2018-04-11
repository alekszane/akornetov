package ru.job4j.chess.board;

import org.junit.Test;
import ru.job4j.chess.extentions.FigureNotFoundException;
import ru.job4j.chess.figures.Bishop;
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
	public void testTheBoard()  {
		Cell source = new Cell(0, 0);
		Cell dest = new Cell(7, 0);
		Figure elephant = new Bishop(source);
		Board board = new Board();
		try {
			board.fillFigures(0, 0, elephant);
		} catch (FigureNotFoundException f) {
			System.out.println("The figure is not found");
		}
		boolean two = board.move(source, dest, elephant);
		boolean one = true;
		assertThat(true, is(two));
	}
}
