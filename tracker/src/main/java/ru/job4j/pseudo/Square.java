package ru.job4j.pseudo;

/**
 * Created by All on 03.01.2018.
 */
public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++\n");
        pic.append("+  +\n");
        pic.append("+  +\n");
        pic.append("++++");
        return pic.toString();
    }
}