package ru.job4j.start;


/**
 * Created by All on 29.12.2017.
 */
public class StubInput implements Input {
    private String[] answers; //Ответы пользователя
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    } // конструктор Stub Input

    @Override
    public String ask(String question) {
        String a = "6";
        return (position < answers.length) ? answers[position++] : a;
    }

    @Override
    public int ask(String question, int[] ranges) {
        int key  = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value: ranges){
            if (value == key){
                exist = true;
                break;
            }
        }
        if (!exist){
            throw  new UnsupportedOperationException("Operation not supported");
        }
        return key;
    }

}