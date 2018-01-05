package ru.job4j.pseudo;

import java.util.StringJoiner;
/**
 * Created by All on 03.01.2018.
 */
public class Triangle implements Shape {
String ls = System.lineSeparator();
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  ^  ");
        pic.append(ls);
        pic.append(" ^ ^ ");
        pic.append(ls);
        pic.append("^^^^^");
        return pic.toString();
    }
}
