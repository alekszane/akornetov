package ru.job4j.model;
/**
 * Created by All on 21.12.2017.
 */
public class Item {
    private String id; //
    private String name; //
    private String desc; //
    private Long created; //
    private String comment; //

    private Item(String id, String name, String desc, Long created, String comment) { // Создаем Конструктор
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comment = comment;
    }
    /***Геттеры и сеттеры***/
    public String getId() { //Возвращает Id
        return this.id;
    }

    public String setId(String id) { // Добавляет Id
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return name;
    }

    public String getDesc() {
        return this.desc;
    }
    public String setDesc(String desc) {
        return desc;
    }
    public Long getCreated() {
        return this.created;
    }

    public Long setCreated(Long created) {
        return created;
    }

    public String getComment() {
        return this.comment;
    }

    public String setComment(String comment) {
        return comment;
    }
    /***Геттеры и сеттеры***/
}
