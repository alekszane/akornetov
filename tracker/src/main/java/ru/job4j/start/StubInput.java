package ru.job4j.start;


import java.util.List;

/**
 * Created by All on 29.12.2017.
 */
public class StubInput implements Input {
    private List<String> answers; //Ответы пользователя
    private int position = 0;

    public StubInput(List<String> answers) {
        this.answers = answers;
    } // конструктор Stub Input

    @Override
    public String ask(String question) {
        String a = "7";
        return (position < answers.size()) ? answers.get(position++) : a;
    }

    @Override
    public int ask(String question, List<Integer> ranges) {
        int key  = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value: ranges) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw  new UnsupportedOperationException("Operation not supported");
        }
        return key;
    }

}