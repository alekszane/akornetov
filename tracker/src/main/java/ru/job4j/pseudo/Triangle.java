package ru.job4j.pseudo;

import java.util.StringJoiner;
/**
 * Created by All on 03.01.2018.
 */
public class Triangle implements Shape {
String br = System.lineSeparator();
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        StringJoiner str = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        pic.append("  ^  ");
        pic.append(br);
        pic.append(" ^ ^ ");
        pic.append(br);
        pic.append("^^^^^");
        return pic.toString();
    }
}
