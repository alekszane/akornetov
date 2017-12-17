package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 17.12.2017.
 */
public class TeacherTest {
    @Test
    public void whenDoctorHealBolnogoThenGud() {
        Teacher teach = new Teacher("Коржиков", "Педагогическое", 35, 1);
        Student student = new Student("Петрова", 25);
        assertThat(teach.teachStudents(student), is("Учитель Коржиков учит Петрова лекции 1"));
    }
}