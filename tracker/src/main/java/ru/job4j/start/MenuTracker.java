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
	private  Input input; //Интерфейс ввода
	private Tracker tracker; // Трекер
	//private boolean exit; // Выход

	private UserAction[] actions = new UserAction[6]; // В массиве храним номера действий, которые может совершить пользователь

	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
		//this.exit = false;
	}

	public UserAction[] getActions() {
		return actions;
	}

	public  void fillActions() {
		this.actions[0] = new AddItem(); //создаем экземпляр внутреннего не статичного класса
		this.actions[1] = new MenuTracker.ShowItems(); //создаем экземпляр внутреннего статичного класса
		this.actions[2] = new EditItem(); // создаем экземпляр внешнего класса
		this.actions[3] = this.new DeleteItem(); // внутренний не статичный класс
		this.actions[4] = this.new FindItemById(); // внутренний не статичный класс
		this.actions[5] = this.new FindItemsByName(); // внутренний не статичный класс
		//this.actions[6] = this.new Exit(); // выход из меню
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

	/*public boolean exit(){
		return this.exit;
	}*/

	private class AddItem implements UserAction { //Внутренний класс реализует добавление заявки.

		public  int key() {
			return  0;
		}

		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task's name: ");
			String desc = input.ask("Please enter the desck's name: ");
			tracker.add(new Task(name, desc));
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Add the new item");
		}
	}

	private static class ShowItems implements UserAction { //Внутренний статический класс реализует показ всех заявок.

		public  int key() {
			return  1;
		}

		public  void execute(Input input, Tracker tracker) {
			for (Item item : tracker.getAll()) {
				System.out.println(String.format("%s. %s", item.getId(), item.getName()));
				break;
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
				break;
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
				break;
			}
		}

		public String info() {
			return  String.format("%s. %s", this.key(), " Find item by name ");
		}
	}

}
