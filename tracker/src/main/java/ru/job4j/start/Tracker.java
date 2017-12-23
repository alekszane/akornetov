package ru.job4j.start;
import ru.job4j.model.Item;
import java.util.Random;
/**
 * Created by All on 21.12.2017.
 */
public class Tracker {

    private final Item[] items = new Item[100]; // * Массив для хранения заявок.
    private int position = 0; //* Указатель ячейки для новой заявки.
    private final static Random rand = new Random(); //* в константу rand помещаем слуайное число.
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        // Метод генерации ID.
        return String.valueOf(rand.nextInt(100));
    }
    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
  /**Метод  реализующий редактирование заявки в хранилище(замениет ячейку в массиве this.items).
  *@param id
  *@param item
  */
    public void replace(String id, Item item) {
        for(int x = 0; x < position; x++) {
            if(id.equals(items[x])) {
                this.items[x] = item;
            }
        }
    }
    /** Lолжен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
    * Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy()
    *@param id
    */
    public void delete(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                Item[] itemdel = new Item[100];
                System.arraycopy(items, 1, itemdel, 0, 1);
                System.arraycopy(itemdel, 0, items, 0, 1);
                position --;
                break;
            }
        }
    }

    public Item[] findAll(Item[] items) { // возвращает копию массива this.items без null элементов.
        int n = 0;
        for(Item item : items) {
            items[n] = item;
            n++;
            if (n == position) {
                break;
            }
        }
        return items;
    }
}