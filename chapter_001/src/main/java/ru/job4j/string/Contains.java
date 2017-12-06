package ru.job4j.string;
/**
 * Created by All on 04.12.2017.
 */
public class Contains {
	/**
	 * @param origin оригинальная строка.
	 * @param sub строка в строке.
	 * @return true.
	 */
	boolean contains(String origin, String sub) {
		char[] arrayOrigin = origin.toCharArray();
		char[] arraySub = sub.toCharArray();
		boolean result = false;

		for (int i = 0; i < arrayOrigin.length; i++) {
				int s;
				for (s = 0; s < arraySub.length; s++) {
					if (arraySub[s] != arrayOrigin[i + s]) {
						break;
					}
				}
				//Если совпали все элементы  arraySub.
				if (s == arraySub.length) {
					result = true;
					break;
				}
			}
		return result;
	}

}