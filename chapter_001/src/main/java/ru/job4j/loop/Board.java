package ru.job4j.loop;
/**
 * Created by All on 22.11.2017.
 */
public class Board {
    /**
     * @param wight  ширина
     * @param height высота
     * @return Доска
     */
    public String paint(int wight, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int x = 0; x < wight; x++) {
                builder.append((i + x) % 2 == 0 ? "x" : " ");
            }
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
