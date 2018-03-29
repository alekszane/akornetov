package ru.job4j.start;
import ru.job4j.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Created by All on 21.12.2017.
 */
public class Tracker {

    private final List<Item> items = new ArrayList<>(); // * Массив для хранения заявок.
    //private int position = 0; //* Указатель ячейки для новой заявки.
    private final static Random RAND = new Random(); //* в константу rand помещаем слуайное число.

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        // Метод генерации ID.
        return String.valueOf(RAND.nextInt(100));
    }
    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }
    /**Метод реализаущий редактирование заявки пользователем.
    */
    public void edit(Item fresh) {
        for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if (item != null && item.getId().equals(fresh.getId())) {
                items.set(index, fresh);
                break;
            }
        }
    }

  /**Метод  реализующий редактирование заявки в хранилище(замениет ячейку в массиве this.items).
  *@param id
  *@param item
  @return items
  */
    public List<Item> replace(String id, Item item) {
        int count = 0;
        for (Item index : items) {
            if (index.getId() == (id)) {
                items.set(count, item);
            }
            count++;
        }
        return items;
    }
    /** Должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
    * Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy()
    *@param id
    */
    public void delete(String id) {
        for (Item item : items) {
            if (item.getId() == (id)) {
               items.remove(item);
               break;
            }
        }
    }
    /**Метод  возвращает копию массива this.items без null элементов.
     *@param items
     */
   /* public List<Item> findAll(List<Item> items) {
        return items;
    }*/
/**Метод проверяет в цикле все элементы массива this.items.
* сравнивая name (используя метод getName класса Item) с аргументом метода String key.
* Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
 @param key;
 @return resName;
 */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item.getName().contains(key)) {
                result.add(item);
            }
        }
        return result;
    }
/** Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item.
* Если Item не найден - возвращает null
 @param id;
 @return res;
*/
    public Item findById(String id) {
        Item res = null;
        for (Item item : items) {
            if (item.getId() == (id)) {
                res = item;
                    break;
            }
        }
        return res;
    }
/**Метод возвращает все заполненные ячейки массива this.items.
*
*/
    public List<Item> getAll() {
        return items;
    }
}
