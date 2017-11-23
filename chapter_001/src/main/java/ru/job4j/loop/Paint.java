package ru.job4j.loop;
/**
 * Created by All on 23.11.2017.
 */
public class Paint {
    /**
     * @param h высота
     * @return  Пирамида
     */
    public String piramid(int h) {
        StringBuilder piramida = new StringBuilder();
        int w = (h * 2) - 1;    //зависимость ширины пирамиды
        for (int i = 1; i <= h; i++) {
            for (int x = 1; x <= w; x++) {
                piramida.append((x > (h - i) && x < (h + i)) ? "^" : " ");
            }
            piramida.append(System.getProperty("line.separator"));
        }
        return piramida.toString();
    }
}