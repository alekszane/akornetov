package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Teacher extends Professions {

    private int numberLesson; // номер лекции.

    public Teacher(String name, String education, int age, int numberLesson) {
        super(name, education, age);
        this.numberLesson = numberLesson;
    }

    /** Учитель учит студента лекции.
     *@param student Студент.
     *@return String результат.
     */
    protected String teachStudents(Student student) {
        return String.format("Учитель %s учит %s лекции %s", this.getName(), student.getName(), this.numberLesson);
    }
}
