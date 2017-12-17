package ru.job4j.professions;

/**
 * Created by All on 17.12.2017.
 */
public class Pacient {

    public String name;
    public int age;

    public Pacient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
