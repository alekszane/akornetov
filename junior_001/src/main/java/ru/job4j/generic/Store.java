package ru.job4j.generic;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 28.05.2018.
 */
public interface Store<T  extends Base> {
	void add(T model);

	boolean replace(String id, T model);

	boolean delete(String id);

	T findById(String id);
}
