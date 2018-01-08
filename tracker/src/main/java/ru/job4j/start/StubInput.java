package ru.job4j.start;

/**
 * Created by All on 29.12.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    } // конструктор Stub Input

    public String ask(String question) {
        String a = "6";
        return (position < answers.length) ? answers[position++] : a;
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new UnsupportedOperationException("Unsupported operation");
        }
    }

}