package ru.job4j.start;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.model.Item;


/**
 * Created by All on 29.12.2017.
 */
public class StartUITest {

    private final Tracker tracker = new Tracker();

    public Tracker createAndAdd(Item item) { //метод который используется при рефакторинге метода.
        // whenAddItemAndShowItemByName и whenAddItemAndEditItem.
        tracker.add(item);
        return tracker;
    }

    // Метод тестирует добавление заявки пользователем.
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"}); //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init(); // создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    //Метод позваляет просматривать пользователю колличество всех заявок.
    @Test
    public void whenUserShowAllItemsThenShowItemsLenght() {
       Item item = new Item("name4", "desc4", 4);
        tracker.add(item);
        Item item1 = new Item("name5", "desc5", 5);
        tracker.add(item1);
        Input input = new StubInput(new String[]{"1"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll().length, is(2));
    }

    // Метод тестирует редактирование полей заявки пользователем.
    @Test
    public void whenUpdateThenTrackerUpdateValue() {
        Item item = new Item("name", "desk", 1);
        tracker.add(item); //Напрямую добавляем заявку
        Input input = new StubInput(new String[]{"2", item.getName(), "test name", "desc", "6"}); //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();  // создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    // Тестируем удаление заявки пользователем.
    @Test
    public void whenAddItemAndThenDeleteItem() {
        Item item = new Item("name4", "desc4", 4);
        tracker.add(item);
        Item item2 = new Item("name5", "desc5", 5);
        tracker.add(item2);
        Input input = new StubInput(new String[]{"3", "name4"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name5"));
    }

    // Тестируем поиск по ID заявки пользователем.
    @Test
    public void whenAddItemAndFindById() { // ищем заявку по имени тк пользователь не знает id.
        Item item = new Item("name6", "desc6", 6);
        tracker.add(item);
        Input input = new StubInput(new String[]{"4", "name6", item.getId()});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name6"));
    }

    // Тестируем поиск по name заявки пользователем.
    @Test
    public void whenAddItemAndShowItemByName() {
        Item item = new Item("name2", "desc2", 9);
        Input input = new StubInput(new String[]{"5", "name2"});
        new StartUI(input, this.createAndAdd(item)).init();
        assertThat(this.createAndAdd(item).getAll()[0].getName(), is("name2"));
    }
}