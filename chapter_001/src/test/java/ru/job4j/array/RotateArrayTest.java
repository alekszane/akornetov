package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 26.11.2017.
 */
public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 2 на 2.
        RotateArray rotate = new RotateArray();
        assertThat(rotate.rotate(new int[][]{{1, 2}, {3, 4}}), is(new int[][]{{3, 1}, {4, 2}}));
    }
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 3 на 3.
        RotateArray rotate = new RotateArray();
        assertThat(rotate.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), is(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}));
    }
}