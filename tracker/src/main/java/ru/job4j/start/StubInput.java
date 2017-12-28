package ru.job4j.start;

/**
 * Created by All on 29.12.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    public String ask(String question) {
        String a = "6";
        return (position < answers.length) ? answers[position++] : a;
    }

}
