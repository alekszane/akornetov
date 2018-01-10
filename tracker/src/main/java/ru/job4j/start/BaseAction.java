package ru.job4j.start;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 10.01.2018.
 */
public abstract class BaseAction implements UserAction {
	private final int key;
	private final String name;

	protected BaseAction(int key, String name) { //Конструктор абстрактного класса
		this.key = key;
		this.name = name;
	}

	@Override
	public int key() { //Метод key
		return this.key;
	}

	@Override
	public String info() { // Метод info
		return  String.format("%s. %s", this.key(), this.name);
	}
}
