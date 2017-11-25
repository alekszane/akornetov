package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by All on 25.11.2017.
 */
public class TurnTest {
    //тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        assertThat(turn.back(new int[]{2, 6, 1, 4}), is(new int[]{4, 1, 6, 2}));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turn = new Turn();
        assertThat(turn.back(new int[]{1, 2, 3, 4, 5}), is(new int[]{5, 4, 3, 2, 1}));
    }
}
