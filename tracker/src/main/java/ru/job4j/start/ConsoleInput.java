package ru.job4j.start;
import java.util.Scanner;
/**
 * Created by All on 27.12.2017.
 */
public class ConsoleInput implements Input {

    private Scanner scanner =  new Scanner(System.in);

    public String ask(String question) {
    System.out.print(question);
        return scanner.nextLine();
    }
}
