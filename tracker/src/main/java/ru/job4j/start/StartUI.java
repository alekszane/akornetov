package ru.job4j.start;
import ru.job4j.model.*;
/**
 * Created by All on 27.12.2017.
 */
public class StartUI {
    private static final String ADD = "0"; // Константа меню для добавления новой заявки.
    private static final String SHOW = "1"; // Константа меню для просмотра всех заявок.
    private static final String EDIT = "2"; // Константа меню для редактирования заявки.
    private static final String DELETE = "3"; // Константа меню для редактирования заявки.
    private static final String FINDBYID = "4"; // Константа меню для поиска по ID заявки.
    private static final String FINDBYNAME = "5"; // Константа меню для поиска по NAME заявки.
    private static final String EXIT = "6"; //* Константа для выхода из цикла.
    private final Input input; //Получение данных от пользователя.
    private final Tracker tracker; //Хранилище заявок.
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    // Метод Выводит в консоль пункты меню.
    private void showMenu() {
        System.out.println("Menu");
        System.out.println("Add menu item enter 0");
        System.out.println("Show all items - enter 1");
        System.out.println("Edit item - enter 2");
        System.out.println("Delete item enter 3");
        System.out.println("Find item by id - enter 4");
        System.out.println("Find items by name - enter 5");
        System.out.println("Exit - enter 6");
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem(); //добавление заявки вынесено в отдельный метод.
            } else if (SHOW.equals(answer)) {
                this.show();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DELETE.equals(answer)) {
                this.delete();
            } else if (FINDBYID.equals(answer)) { // поиск будет  идти через имя объекта т.к пользователь не знает id
                this.findById();
            }  else if (FINDBYNAME.equals(answer)) {
                this.name();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавление новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите опиание заявки :");
        Item item = new Item(name, desc, 1);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
    /**
     * Метод реализует редактирование заявки в хранилище.
     */
    public void edit() {
        System.out.println("Редактирование заявки");
        String name = input.ask("Введите имя редактируемой завки");
        Item[] edit2 = tracker.findByName(name);
        String name1 = input.ask("Введите имя новой заяки");
        String desc = input.ask("Введите описание новой заявки");
        Item item = new Item(name1, desc, 2);
        for (Item item1:edit2) {
            if ((item1.getName()).equals(name)) {
                Item[] result = tracker.replace((item1.getId()), item);
                break;
            }
        }
        System.out.println("Заявка  " + item.getName() + "   отредактирована");
    }
    /**
     * Метод реализует удаление заявки в хранилище.
     */
    public void delete() {
        System.out.println("Удаляем заявку");
        String name = input.ask("Введите имя удаляемой заявки");
        Item[] find = tracker.findByName(name);
        for (Item item1 : find) {
            if ((item1.getName()).equals(name)) {
                tracker.delete(item1.getId());
                System.out.println("Заявка " + item1.getName() + " удалена");
                break;
            }
        }
    }
    /**
     * Метод реализует поиск объекта по его id.
     */
    public void findById() {
        System.out.println("Поиск объекта по его id");  //поиск идет через имя заявки тк клиент не знает id заявки
        String name = input.ask("Введите имя объекта");
        Item[] find1 = tracker.findByName(name);
        for (Item item1 : find1) {
            if ((item1.getName()).equals(name)) {
                Item result = tracker.findById(item1.getId());
                System.out.println("Заявка  " + result.getName() + "  найдена");
                break;
            }
        }
    }
    /**
     * Метод реализует поиск объекта по его имени.
     */
    public void name() {
        System.out.println("Поиск объекта по его имени");
        String name = input.ask("Введите имя объекта");
        Item[] find = tracker.findByName(name);
        for (Item item1 : find) {
            if ((item1.getName()).equals(name)) {
                System.out.println("Заявка  " + item1.getName() + "  найдена");
                break;
            }
        }
    }
    /**
     * Метод реализует Вывод всех заявок.
     */
    public void show() {
        System.out.println("Вывод всех заявок");
        Item[] array = tracker.getAll();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
