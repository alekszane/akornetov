package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Professions {
    public String name; //Имя
    public String education; // Образование
    public int age; // Возраст

    public Professions(String name, String education, int age) {
        this.name = name;
        this.education = education;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getEducation() {
        return this.education;
    }

    public int getAge() {
        return this.age;
    }
}
