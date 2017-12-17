package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Engineer extends Professions {

public String scheme; //Чертеж

    public Engineer(String name, String education, int age, String scheme) {
        super(name, education, age);
        this.scheme = scheme;
    }
    /** Инженер обслуживает механизм.
     *@param machine Пациент.
     *@return result String результат.
     */
    public String servesMachine(Machine machine) {
        String res = "Инженер " + this.name + " обслуживает " + machine.getName();
        return res;
    }
    /* Инженер изучает чертеж*/
    public String studyScheme(String scheme) {
        return this.scheme;
    }
}
