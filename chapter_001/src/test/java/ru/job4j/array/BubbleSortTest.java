package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 25.11.2017.
 */
public class BubbleSortTest {
    //тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        assertThat(bubble.sort(new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5}), is(new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8}));
    }
}
