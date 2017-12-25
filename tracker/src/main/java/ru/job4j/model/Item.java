package ru.job4j.model;
/**
 * Created by All on 21.12.2017.
 */
public class Item {
    public String id; //  ID заявки
    public String name; // Имя заявки
    public String desc; // Описание заявки
    public long created; // Дата создания заявки
    private String comment; // Комментарий к заявке



    public Item(String name, String desc, long created) { // Создаем Конструктор
        this.name = name;
        this.desc = desc;
        this.created = created;
    }
    public Item() { }  // конструктор без параметров по умолчанию


    /***Геттеры и сеттеры***/
    public String getId() { //Возвращает Id
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getCreated() {
        return this.created;
    }

    public String getComment() {
        return this.comment;
    }

    /***Геттеры и сеттеры***/
}
