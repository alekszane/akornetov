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
    private List<Integer> ranges = new ArrayList<Integer>(7);
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillRanges(MenuTracker menu) {  // метод заполняет лист ranges

        List<UserAction> ua = menu.getActions();
        for (int i = 0; i < ua.size(); i++) {
            ranges.add(i);
        }
    }
    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        fillRanges(menu);
        do {
            menu.show();
            menu.select(input.ask("Select: ", ranges));
        }
        //while (!"y".equals(this.input.ask("For Exit inter y  ")));
        while (!menu.exitProgram());
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}
