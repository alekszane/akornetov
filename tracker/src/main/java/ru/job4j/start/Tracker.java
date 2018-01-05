package ru.job4j.start;
import ru.job4j.model.Item;
import java.util.Random;
/**
 * Created by All on 21.12.2017.
 */
public class Tracker {

    private final Item[] items = new Item[100]; // * Массив для хранения заявок.
    private int position = 0; //* Указатель ячейки для новой заявки.
    private final static Random RAND = new Random(); //* в константу rand помещаем слуайное число.
    private final String ls = System.lineSeparator();
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
    public boolean add(Item item) {
        boolean result = false;
        if (item != null) {
            item.setId(generateId());
            this.items[this.position++] = item;
            result = true;
        }
        return result;
    }
  /**Метод  реализующий редактирование заявки в хранилище(замениет ячейку в массиве this.items).
  *@param id
  *@param item
  @return items
  */
    public Item[] replace(String id, Item item) {
        for (int x = 0; x < position; x++) {
            if (id.equals(items[x].getId())) {
                this.items[x] = item;
            }
        }
        return items;
    }
    /** Должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
    * Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy()
    *@param id
    */
    public void delete(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                Item[] itemdel = new Item[100];
                System.arraycopy(items, 1, itemdel, 0, 1);
                System.arraycopy(itemdel, 0, items, 0, 1);
                position--;
                break;
            }
        }
    }
    /**Метод  возвращает копию массива this.items без null элементов.
     *@param items
     */
    public Item[] findAll(Item[] items) {
        int n = 0;
        for (Item item : items) {
            items[n] = item;
            n++;
            if (n == position) {
                break;
            }
        }
        return items;
    }
/**Метод проверяет в цикле все элементы массива this.items.
* сравнивая name (используя метод getName класса Item) с аргументом метода String key.
* Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
 @param key;
 @return resName;
 */
    public Item[] findByName(String key) {
        int x = 0;
        int cont = 0;
        Item[] resName = new Item[2];

        for (Item item : items) {
            if (cont < position) {
                cont++;
                if (item.getName().equals(key)) {
                    resName[x] = item;
                    x++;
                }
            } else if (cont == position) {
                break;
            }
        }
        return resName;
    }
/** Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item.
* Если Item не найден - возвращает null
 @param id;
 @return res;
*/
    public Item findById(String id) {
        int x = 0;
        Item res = null;
        for (Item item : items) {
            if (item.getId().equals(id) && item != null) {
                res = item;
                    break;
            }
        }
        return res;
    }
/**Метод возвращает все заполненные ячейки массива this.items.
*
*/
    public Item[] getAll() {
        Item[] all = new Item[position];
        for (int i = 0; i < all.length; i++) {
            all[i] = items[i];
        }
        return all;
    }
}
