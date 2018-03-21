package ru.job4j.start;
import java.util.List;
import java.util.Scanner;
/**
 * Created by All on 27.12.2017.
 */
 //
public class ConsoleInput implements Input {

    private Scanner scanner =  new Scanner(System.in);

    public String ask(String question) {
    System.out.print(question);
        return scanner.nextLine();
    }
    @Override
    public int ask(String question, List<Integer> range) {
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
            throw new MenuOutException("Out of menu range");
        }
    }
}
