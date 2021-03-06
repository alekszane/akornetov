package ru.job4j.collections.sort;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 *         project collections
 *         Created on 30.03.2018.
 */
public class StringsCompareTest {
	@Test
	public void whenStringsAreEqualThenZero() {
		ListCompare compare = new ListCompare();
		int rst = compare.compare(
				"Ivanov",
				"Ivanov"
		);
		assertThat(rst, is(0));
	}

	@Test
	public void whenLeftLessThanRightResultShouldBeNegative() {
		ListCompare compare = new ListCompare();
		int rst = compare.compare(
				"Ivanov",
				"Ivanova"
		);
		assertThat(rst, lessThan(1));
	}

	@Test
	public void whenLeftGreaterThanRightResultShouldBePositive() {
		ListCompare compare = new ListCompare();
		int rst = compare.compare(
				"Petrov",
				"Ivanova"
		);
		assertThat(rst, greaterThan(-4));
	}

	@Test
	public void secondCharOfLeftGreaterThanRightShouldBePositive() {
		ListCompare compare = new ListCompare();
		int rst = compare.compare(
				"Petrov",
				"Patrov"
		);
		assertThat(rst, greaterThan(-1));
	}

	@Test
	public void secondCharOfLeftLessThanRightShouldBeNegative() {
		ListCompare compare = new ListCompare();
		int rst = compare.compare(
				"Patrova",
				"Petrov"
		);
		assertThat(rst, lessThan(2));
	}
}
