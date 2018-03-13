package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 27.02.2018.
 */
public class ConvertListTest {

	@Test
	public  void whenConvertListThenDoubleArray() {
	List<Integer> testList;
	ConvertList convert = new ConvertList();
	Integer[][] array = { {1, 2, 3, 4 } , {5, 6, 7, 8} };
	testList = convert.toList(array);
	Integer[][] result = convert.toArray(testList, 3);
	Integer[][] test = { {1, 2, 3},{4, 5, 6},{7, 8, 0} };
	assertThat(result, is(test));
	}

	@Test
  public void test2() {
	 int[] a = {1, 2, 3};
	 int[] b = {4, 5, 6, 7};

	 List<Integer> expect = new ArrayList<>();

	 int j = 1;
	 for (int i = 0; i < 7; i++) {
				expect.add(j);
				j++;
		}
		ConvertList cList = new ConvertList();
		List<Integer> test;
		 test = cList.convert(Arrays.asList(a, b));
		 assertThat(test, is(expect));
	}
}
