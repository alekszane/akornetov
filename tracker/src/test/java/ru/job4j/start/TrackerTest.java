package ru.job4j.start;
import ru.job4j.model.Item;
import org.junit.Test;
import ru.job4j.start.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by All on 21.12.2017.
 */
public class TrackerTest {
    @Test
    public void addTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1", "desc1", 10);
        tracker.add(item);
        assertThat(tracker.getAll()[0], is(item));
    }

    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("item2", "desc2", 13);
        tracker.add(item);
        Item next = new Item("item3", "desc3", 14);
        tracker.add(next);
        tracker.delete(item.getId());
        assertThat(tracker.getAll()[0], is(next));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("item4", "desc4", 15);
        tracker.add(item);
        Item second = new Item("item", "desc", 10);
        tracker.add(second);
        Item third = new Item("item5", "desc5", 16);
        tracker.add(third);
        Item[] array = new Item[2];
        array = tracker.findAll(tracker.getAll());
        Item[] expect = new Item[3];
        expect[0] = item;
        expect[1] = second;
        expect[2] = third;
        assertThat(array, is(expect));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc6", 17);
        tracker.add(item);
        Item second = new Item("test2", "desc7", 18);
        tracker.add(second);
        Item third = new Item("test", "desc8", 19);
        tracker.add(third);
        String key = "test";
        Item[] res = tracker.findByName(key);
        Item[] expect = new Item[2];
        expect[0] = item;
        expect[1] = third;
        assertThat(res, is(expect));

    }

    @Test
    public void replaceTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc", 20);
        tracker.add(item);
        Item item2 = new Item("test3", "desc3", 22);
        item2.setId(item.getId());
        tracker.replace(item.getId(), item2);
        assertThat(tracker.findById(item.getId()).getName(), is("test3"));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item one = new Item("test", "desc", 23);
        tracker.add(one);
        assertThat(tracker.findById(one.getId()), is(one));
    }

    @Test
    public void getAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1", "desc1", 25);
        tracker.add(item);
        Item two = new Item("two1", "desc2", 26);
        tracker.add(two);
        Item[] expect = new Item[2];
        expect[0] = item;
        expect[1] = two;
        assertThat(tracker.getAll(), is(expect));


    }
}