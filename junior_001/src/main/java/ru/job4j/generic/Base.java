package ru.job4j.generic;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 28.05.2018.
 */
public abstract class Base {
	private final String id;

	protected Base(final String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
