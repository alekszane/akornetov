package ru.job4j.generic;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 28.05.2018.
 */
public interface Store<T  extends Base> {
	void add(T model); //Add model to store/

	boolean replace(String id, T model); //Replace model to store/

	boolean delete(String id);

	T findById(String id);
}
