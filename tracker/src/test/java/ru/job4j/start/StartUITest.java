package ru.job4j.start;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.model.Item;

import java.util.Arrays;


/**
 * Created by All on 29.12.2017.
 */
public class StartUITest {


    public Tracker createAndAdd(Item item) { //метод который используется при рефакторинге метода.
        Tracker tracker = new Tracker();
        tracker.add(item);
        return tracker;
    }

    // Метод тестирует добавление заявки пользователем.
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(Arrays.asList("0", "test name", "desc", "6", "y")); //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init(); // создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll().get(0).getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    //Метод позваляет просматривать пользователю колличество всех заявок.
    @Test
    public void whenUserShowAllItemsThenShowItemsLenght() {
        Tracker tracker = new Tracker();
       Item item = new Item("name4", "desc4", 4);
        tracker.add(item);
        Item item1 = new Item("name5", "desc5", 5);
        tracker.add(item1);
        Input input = new StubInput(Arrays.asList("1", "name", "6", "y"));
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll().size(), is(2));
    }

    // Метод тестирует редактирование полей заявки пользователем.
    @Test
    public void whenUpdateThenTrackerUpdateValue() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desk", 1);
        tracker.add(item); //Напрямую добавляем заявку
        Input input = new StubInput(Arrays.asList("2", item.getName(), "test name", "desc", "6", "y")); //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();  // создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll().get(0).getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    // Тестируем удаление заявки пользователем.
    @Test
    public void whenAddItemAndThenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name4", "desc4", 4);
        tracker.add(item);
        Item item2 = new Item("name5", "desc5", 5);
        tracker.add(item2);
        Input input = new StubInput(Arrays.asList("3", "name4", "6", "y"));
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll().get(0).getName(), is("name5"));
    }

    // Тестируем поиск по ID заявки пользователем.
    @Test
    public void whenAddItemAndFindById() { // ищем заявку по имени тк пользователь не знает id.
        Tracker tracker = new Tracker();
        Item item = new Item("name6", "desc6", 6);
        tracker.add(item);
        Input input = new StubInput(Arrays.asList("4", "name6", item.getId(), "6", "y"));
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll().get(0).getName(), is("name6"));
    }

    // Тестируем поиск по name заявки пользователем.
    @Test
    public void whenAddItemAndShowItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("name2", "desc2", 9);
        Input input = new StubInput(Arrays.asList("5", "name2", "6", "y"));
        new StartUI(input, tracker).init();
        assertThat(this.createAndAdd(item).getAll().get(0).getName(), is("name2"));
    }

}