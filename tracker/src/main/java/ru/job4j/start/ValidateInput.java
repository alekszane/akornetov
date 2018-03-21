package ru.job4j.start;

import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 08.01.2018.
 */
public class ValidateInput implements Input {

	private final Input input;

	public ValidateInput(final  Input input) {
		this.input = input;
	}

	@Override
	public String ask(String question) {
		return this.input.ask(question);
	}

	@Override
	public int ask(String question, List<Integer> range) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = this.input.ask(question, range);
				invalid = false;
			} catch (MenuOutException moe) {
				System.out.println("Please select key from menu.");
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter validate data again.");
			}
		} while (invalid);
		return value;
	}
}
