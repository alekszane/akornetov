package ru.job4j.start;

import java.util.List;

/**
 * Created by All on 27.12.2017.
 */

public interface Input {
    String ask(String question);
    int ask(String question, List<Integer> ranges);
}
