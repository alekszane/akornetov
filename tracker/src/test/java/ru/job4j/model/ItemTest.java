package ru.job4j.model;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 21.12.2017.
 */
public class ItemTest {
    @Test
    public void whenItemNameThenGetName() {
        Item item = new Item();
        assertThat(item.getName(), is("name2"));
    }
}