package ru.job4j.start;
import ru.job4j.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by All on 27.12.2017.
 */
public class StartUI {
    private Input input;
    private Tracker tracker;
    private int[] ranges = new int[6];
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillRanges(MenuTracker menu) {  // метод заполняет массив ranges

        List<UserAction> ua = menu.getActions();
        for (int i = 0; i < ua.size(); i++) {
            ranges[i] = i;
        }
    }
    /**
     * Основой цикл программы.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        fillRanges(menu);
        do {
            menu.show();
            menu.select(input.ask("Select: ", ranges));
        } while (!"y".equals(this.input.ask("Exit? y : ")));
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}
