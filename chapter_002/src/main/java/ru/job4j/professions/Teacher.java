package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Teacher extends Professions {

    public int numberLesson; // номер лекции.

    public Teacher(String name, String education, int age, int numberLesson) {
        super(name, education, age);
        this.numberLesson = numberLesson;
    }
    /** Учитель учит студента лекции.
     *@param student Пациент.
     *@return result String результат.
     */
    public String teachStudents(Student student) {
        String res = "Учитель " + this.getName() + " учит " + student.getName() + " лекции " + this.numberLesson;
        return res;
    }
}
