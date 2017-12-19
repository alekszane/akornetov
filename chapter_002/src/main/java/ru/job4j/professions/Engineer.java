package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Engineer extends Professions {

private String scheme; //Чертеж

    public Engineer(String name, String education, int age, String scheme) {
        super(name, education, age);
        this.scheme = scheme;
    }
    /** Инженер обслуживает механизм.
     *@param machine Механизм.
     *@return String результат.
     */
    protected String servesMachine(Machine machine) {
        return String.format("Инженер %s обслуживает %s", this.getName(), machine.getName());
    }
    /* Инженер изучает чертеж*/
    protected String studyScheme(String scheme) {
        return this.scheme;
    }
}
