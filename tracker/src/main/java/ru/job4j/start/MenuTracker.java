package ru.job4j.start;
import ru.job4j.model.*;

import javax.jws.soap.SOAPBinding;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project tracker
 *         Created on 06.01.2018.
 */
 class EditItem implements UserAction { // Внешний класс реализует редактирование заявки пользователем.
	public  int key() {
		return  2;
	}

	public  void execute(Input input, Tracker tracker) {
		String id = input.ask("Please enter the task's id: ");
		String name = input.ask("Please enter the task's name: ");
		String desc = input.ask("Please enter the task's desc: ");
		Task task = new Task(name, desc);
		task.setId(id);
		tracker.edit(task);
	}

	public String info() {
		return  String.format("%s. %s", this.key(), " Edit the new item ");
	}
 }

public class MenuTracker {
	private  Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[7]; // В массиве храним номера действий, которые может совершить пользователь

	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public  void fillActions() {
		this.actions[0] = this.new AddItem();
		this.actions[1] = new MenuTracker.ShowItems();
		this.actions[2] = new EditItem();
		this.actions[3] = new DeleteItem();
		this.actions[4] = new FindItemById();
		this.actions[5] = new FindItemsByName();
		this.actions[6] = new Exit();
	}

	public void select(int key) { //Метод выполняет действия выбранные пользователем.
		this.actions[key].execute(this.input, this.tracker);
	}

	public void  show() { // Метод выводит меню.
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}

	private class AddItem implements UserAction { //Внутренний класс реализует добавление заявки.

		public  int key() {
			return  0;
		}

		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			String desc = input.ask("Please enter the desck's name: ");
			tracker.add(new Task(name, "first desc"));
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Add the new item ");
		}
	}

	private static class ShowItems implements UserAction { //Внутренний статический класс реализует показ всех заявок.

		public  int key() {
			return  1;
		}

		public  void execute(Input input, Tracker tracker) {
			for (Item item : tracker.getAll()) {
				System.out.println(String.format("%s. %s", item.getId(), item.getName()));
			}
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Show all items ");
		}
	}

	private class DeleteItem implements UserAction { //Внутренний класс реализует удаление заявки.

		public  int key() {
			return  3;
		}

		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			Item[] find = tracker.findByName(name);
			for (Item itm : find) {
				if (itm != null && itm.getName().equals(name)) {
					tracker.delete(itm.getId());
				}
			}
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Delete is item ");
		}
	}

	private class FindItemById implements UserAction { //Внутренний класс реализует поиск объекта по его id.

		public  int key() {
			return  4;
		}

		public  void execute(Input input, Tracker tracker) {
			String id = input.ask("Please enter the task's id: ");
			Item find = tracker.findById(id);
			System.out.println("Task found =) name -  " + find.getName());
			}


		public String info() {
			return  String.format("%s. %s", this.key(), " Find item by id");
		}
	}

	private class FindItemsByName implements UserAction { // Внутренний класс реализует поиск объекта по его имени.

		public  int key() {
			return  5;
		}

		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			Item[] find = tracker.findByName(name);
			for (Item itm : find) {
				if (itm != null && itm.getName().equals(name)) {
					System.out.println("Task found");
				}
			}
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Find item by name ");
		}
	}

	private class Exit implements UserAction { // Внутренний класс реализует выход из программы.

		public  int key() {
			return  6;
		}

		public  void execute(Input input, Tracker tracker) {

			String name = input.ask("input n ");
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Exit ");
		}
	}

}
