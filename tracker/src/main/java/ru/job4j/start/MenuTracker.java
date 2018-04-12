package ru.job4j.start;
import ru.job4j.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 06.01.2018.
 */
 class EditItem extends BaseAction { // Внешний класс реализует редактирование заявки пользователем.

	public  EditItem(int key, String name) {

		super(key, name);
	}

	@Override
	public  void execute(Input input, Tracker tracker) {
		String id = input.ask("Please enter the task's id: ");
		String name = input.ask("Please enter the task's name: ");
		String desc = input.ask("Please enter the task's desc: ");
		Task task = new Task(name, desc);
		task.setId(id);
		tracker.edit(task);
	}
 }

public class MenuTracker {
	private Input input; //Интерфейс ввода
	private Tracker tracker; // Трекер
	private boolean exit = false;

	private List<UserAction> actions = new ArrayList<UserAction>(7); // В листе храним номера действий, которые может совершить пользователь

	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public List<UserAction> getActions() {
		return actions;
	}

	public void fillActions() {
		this.actions.add(this.new AddItem(0, "Add the new item")); //создаем экземпляр внутреннего не статичного класса
		this.actions.add(new MenuTracker.ShowItems(1, "Show all items")); //создаем экземпляр внутреннего статичного класса
		this.actions.add(new EditItem(2, "Edit the new item")); // создаем экземпляр внешнего класса
		this.actions.add(this.new DeleteItem(3, "Delete is item")); // внутренний не статичный класс
		this.actions.add(this.new FindItemById(4, "Find item by id")); // внутренний не статичный класс
		this.actions.add(this.new FindItemsByName(5, " Find item by name")); // внутренний не статичный класс
		this.actions.add(this.new Exit(6, " Exit program")); //внутренний не статичный класс
	}

	public void select(int key) { //Метод выполняет действия выбранные пользователем.
		this.actions.get(key).execute(this.input, this.tracker);
	}

	public void show() { // Метод выводит меню.
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}

	public  boolean exitProgram() {
		return this.exit;
	}


	private class AddItem extends BaseAction { //Внутренний класс реализует добавление заявки наследуем от абстрактного класса.

		public AddItem(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			String desc = input.ask("Please enter the desck's name: ");
			tracker.add(new Task(name, desc));
		}
	}

	private static class ShowItems extends BaseAction { //Внутренний статический класс реализует показ всех заявок.

		public ShowItems(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.getAll()) {
				System.out.println(String.format("%s. %s", item.getId(), item.getName()));
				break;
			}
		}
	}

	private class DeleteItem extends BaseAction { //Внутренний класс реализует удаление заявки.

		public DeleteItem(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			List<Item> find = tracker.findByName(name);
			for (Item itm : find) {
				if (itm != null && itm.getName().equals(name)) {
					tracker.delete(itm.getId());
				}
				break;
			}
		}
	}

	private class FindItemById extends BaseAction { //Внутренний класс реализует поиск объекта по его id.

		public FindItemById(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Please enter the task's id: ");
			Item find = tracker.findById(id);
			System.out.println("Task found =) name -  " + find.getName());
		}
	}

	private class FindItemsByName extends BaseAction { // Внутренний класс реализует поиск объекта по его имени.

		public FindItemsByName(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			List<Item> find = tracker.findByName(name);
			for (Item itm : find) {
				if (itm != null && itm.getName().equals(name)) {
					System.out.println("Task found");
					System.out.println(itm.getId());
				}
				break;
			}
		}
	}

	private class Exit extends BaseAction { //Внутренний класс реализует выход из программы.

		public  Exit(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
				exit = true;
		}
	}
}


