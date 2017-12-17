package ru.job4j.professions;
/**
 * Created by All on 15.12.2017.
 */
public class Doctor extends Professions {

   private String illness; //Болезнь

   public Doctor(String name, String education, int age, String illness) {
    super(name, education, age);
    this.illness = illness;
   }
   /** Доктор лечит пациента.
   *@param pacient Пациент
   *@return result результат действия
   */
   public String treatPatients(Pacient pacient) {
      String result = "Доктор " + this.name + " лечит " +  pacient.getName();
      return result;
   }
   /* Доктор определяет болезнь.*/
   public String whatIsWrong(String illness) {
      return this.illness;
   }
}