package ru.job4j.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 02.05.2018.
 */
public class Logic3T {
	private final Figure3T[][] table;

	public Logic3T(Figure3T[][] table) {
		this.table = table;
	}

	public boolean isWinnerX() {
	TicTacToe ticTac = new TicTacToe();

	boolean result = false;
	List<Figure3T> figures = new ArrayList<>();
	int count = 0;
	int num = 0;

		for (int i = 0; i < ticTac.getSize(); i++) {
			for (int j = 0; j < table.length; j++) {
				if (table[i][j] != null) {
					figures.add(count, table[i][j]);
					count++;
				}
			}
		}

		for (Figure3T figure : figures) {
			if (figure.hasMarkX()) {
				num++;
			}
			if (num == table.length) {
				result = true;
			}
		}

		return result;
	}

	public boolean isWinnerO() {
		boolean result = false;
		List<Figure3T> figures = new ArrayList<>();
		int count = 0;
		int num = 0;

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if (table[i][j] != null) {
					figures.add(count, table[i][j]);
					count++;
				}
			}
		}

		for (Figure3T figure : figures) {
			if (!figure.hasMarkX()) {
				num++;
			}
			if (num == table.length) {
				result = true;
			}
		}
		return result;
	}

	public boolean hasGap() {
		return true;
	}
}
