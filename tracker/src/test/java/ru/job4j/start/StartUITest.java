package ru.job4j.start;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.model.Item;
import ru.job4j.start.Input;
import ru.job4j.start.StartUI;
import ru.job4j.start.StubInput;
import ru.job4j.start.Tracker;

/**
 * Created by All on 29.12.2017.
 */
public class StartUITest {
    public Tracker createAndAdd(Item item) { //метод который используется при рефакторинге метода
        // whenAddItemAndShowItemByName и whenAddItemAndEditItem
        Tracker tracker = new Tracker();
        tracker.add(item);
        return tracker;
    }
// Метод тестирует добавление заявки пользователем
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithNewName() {
        Tracker tracker = new Tracker();
        String[]one = {"0", "name", "desc", "1"};
        Input input = new StubInput(one);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name"));
    }
    // Метод тестирует изменение полей заявки
    @Test
    public void whenUpdateThenTrackerUpdateValue() {
        Tracker tracker = new Tracker();
        Item item = new Item("name2", "desc2", 2);
        tracker.add(item);
        Item item2 = new Item("name3", "desc3", 3);
        String[] two = {"2", "name2", "name3", "desc3"};
        Input input = new StubInput(two);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name3"));

    }

    @Test
    public void whenAddItemAndThenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name4", "desc4", 4);
        tracker.add(item);
        Item item2 = new Item("name5", "desc5", 5);
        tracker.add(item2);
        String[] three = {"3", "name4"};
        Input input1 = new StubInput(three);
        new StartUI(input1, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name5"));

    }

    @Test
    public void whenAddItemAndFindById() { // ищем заявку по имени тк пользователь не знает id
        Tracker tracker = new Tracker();
        Item item = new Item("name6", "desc6", 6);
        tracker.add(item);
        String[] four = {"4", "name6", item.getId()};
        Input input = new StubInput(four);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name6"));

    }

    @Test
    public void whenAddItemAndFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("name7", "desc7", 7);
        tracker.add(item);
        String[] five = {"5", "name7"};
        Input input = new StubInput(five);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name7"));

    }

    @Test
    public void whenAddItemAndEditItem() {

        Item item = new Item("name2", "desc2", 2);
        Item item2 = new Item("name3", "desc3", 3);
        this.createAndAdd(item);
        String[] two = {"2", "name2", "name3", "desc3"};
        Input input = new StubInput(two);
        new StartUI(input, this.createAndAdd(item)).init();
        assertThat(this.createAndAdd(item2).getAll()[0].getName(), is("name3"));

    }

    @Test
    public void whenAddItemAndShowItemByName() {

        Item item = new Item("name2", "desc2", 9);
        String[] seven  = {"5", "name2"};
        Input input = new StubInput(seven);
        new StartUI(input, this.createAndAdd(item)).init();
        assertThat(this.createAndAdd(item).getAll()[0].getName(), is("name2"));

    }

}
