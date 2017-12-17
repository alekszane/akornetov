package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 17.12.2017.
 */
public class DoctorTest {
    @Test
    public void whenDoctorHealBolnogoThenGud() {
       Doctor doc = new Doctor("Док", "Мед", 35, "Грипп");
       Pacient pac = new Pacient("Больного", 55);
        assertThat(doc.treatPatients(pac), is("Доктор Док лечит Больного"));
    }

    public void whenDoctorWhatIsWrongThenGud() {
        Doctor doc = new Doctor("Док", "Мед", 35, "Грипп");
        assertThat(doc.whatIsWrong("Грипп"), is("Грипп"));
    }
}
