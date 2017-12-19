package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Professions {
    private String name; //Имя
    private String education; // Образование
    private int age; // Возраст

    public Professions(String name, String education, int age) { // Создаем конструктор
        this.name = name;
        this.education = education;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return name;
    }
    public String getEducation() {
        return this.education;
    }

    public int getAge() {
        return this.age;
    }
}
