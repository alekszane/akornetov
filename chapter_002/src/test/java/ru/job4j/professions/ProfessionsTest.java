package ru.job4j.professions;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 17.12.2017.
 */
public class ProfessionsTest {
    @Test
    public void whenProfessionNameThenGetName() {
       Professions profession = new Professions("Имя ", "Образование", 29);
        assertThat(profession.getName(), is("Имя "));
    }

}
