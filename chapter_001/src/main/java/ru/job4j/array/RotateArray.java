package ru.job4j.array;
/**
 * Created by All on 26.11.2017.
 */
public class RotateArray {
    /**
     *
     * @param array передаем двумерный массив
     * @return возвращаем перевернутый по чаовой стрелке на 90 градусов массив
     */
    public int[][] rotate(int[][] array) {
        int row = array.length; //длинна строки
        int col = array[0].length; //длинна столбца
        int[][]result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = array[row - 1 - j][i];
            }
        }
            return result;
    }
}
