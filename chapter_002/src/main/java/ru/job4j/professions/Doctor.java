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
   *@param pacient Пациент.
   *@return result String результат действия.
   */
   protected String treatPatients(Pacient pacient) {
      return String.format("Доктор %s лечит %s", this.getName(), pacient.getName());
   }
   /* Доктор определяет болезнь.*/
   protected String whatIsWrong(String illness) {
      return this.illness;
   }
}