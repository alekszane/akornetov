package ru.job4j.tracker;
import java.util.Random;
/**
 * Created by All on 21.12.2017.
 */
public class Tracker {
    // * Массив для хранение заявок.
    private final Item[] items = new Item[100];
     //* Указатель ячейки для новой заявки.
    private int position = 0;
    //* в константу rn помещаем слуайное число
    private static final Random rn = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        // Метод генерации ID.
        return String.valueOf(rn.nextInt());
    }
    /**
    *Метод замениет ячейку в массиве this.items
    */
    public void replace(String id, Item item) {
        return
    }
    // должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
    //Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy()
    public void delete(String id) {

        for(int ind = 0;  ) {

        }
        return
    }
    // возвращает копию массива this.items без null элементов;
    public Item[] findAll() {

    }


}