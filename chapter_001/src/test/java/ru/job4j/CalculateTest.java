package ru.job4j;

import org.junit.Test;

/**
* Test.
*
* @author Petr Arsentev (parsentev@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class CalculateTest{
/**
* Test echo.
*/ @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Aleksey Kornetov";
    String expect = "Echo, echo, echo : Aleksey Kornetov";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}