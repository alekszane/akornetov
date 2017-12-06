package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
/**
 * Created by All on 29.11.2017.
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        // тест, проверяющий удаление дубликатов строк из массива строк.
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] out = {"Привет", "Мир", "Супер"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(out));
    }
    @Test
    public void whenArrayAllDuplicatesThenDropIt() {
        //тест, проверяющий удаление одинаковых дубликатов строк из массива строк.
        String[] input = {"1", "1", "1", "1", "1"};
        String[] except = {"1"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}