package ru.job4j.start;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 06.01.2018.
 */
public interface UserAction {
	int key(); //Ключ какое действие хочет сделать пользователь
	void execute(Input input, Tracker tracker); // Выполняет действие поиск, удаление и тд.
	String info(); //сообщает пользователю Что данный метод делает
}
