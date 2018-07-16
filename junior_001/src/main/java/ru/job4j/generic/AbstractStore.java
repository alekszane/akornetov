package ru.job4j.generic;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project junior
 *         Created on 28.05.2018.
 */
public class AbstractStore<T extends Base> implements Store<Base> {
	protected SimpleArray<Base> store;
	private int size;

	public AbstractStore(int size) {
		this.store = new SimpleArray<>(size);
		this.size = size;
	}

	@Override
	public void add(Base model) {
		this.store.add(model);
	}

	@Override
	public boolean replace(String id, Base model) {
		boolean result = false;
		for (int i = 0; i < this.size; i++) {
			if (this.store != null) {
				if (this.store.get(i).getId().equals(id)) {
					store.set(getIndexStore(id), model);
					result = true;
					break;
				}
			}
		}
		return  result;
	}

	@Override
	public boolean delete(String id) {
		boolean result =  false;
		for (int i = 0; i < this.size; i++) {
			if (this.store != null) {
				if (this.store.get(i).getId().equals(id)) {
					this.store.delete(i);
					result = true;
					break;
				}
			}
		}
		return  result;
	}

	/**
	 * @param id
	 * @return If don't find id return -1
	 */
	public int getIndexStore(String id) {
		int res = -1;
		for (int index = 0; index < size; index++) {
			if (id.equals(((Base) store.get(index)).getId())) {
				res = index;
			}
		}
		return res;
	}

	@Override
	public Base findById(String id) {
		Base result = null;
		for (int i = 0; i < this.size; i++) {
			if (this.store != null) {
				if (this.store.get(i).getId().equals(id)) {
					result = this.store.get(i);
					break;
				}
			}
		}
		return  result;
	}
}
