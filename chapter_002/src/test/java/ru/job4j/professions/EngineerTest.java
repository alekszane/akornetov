package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by All on 17.12.2017.
 */
public class EngineerTest {
    @Test
    public void whenEngineerServesMachineThisGud() {
        Engineer eng = new Engineer("Василий", "Инжененый вуз", 29, " Чертеж объекта");
        Machine machin = new Machine("установку");
        assertThat(eng.servesMachine(machin), is("Инженер Василий обслуживает установку"));
    }
}
