package ru.job4j.string;
/**
 * Created by All on 04.12.2017.
 */

public class Contains {
	/**
	 * @param origin
	 * @param sub
	 * @return true
	 */
	boolean contains(String origin, String sub) {
		char[] arrayOrigin = origin.toCharArray();
		char[] arraySub = sub.toCharArray();
		boolean result = false;

		for (int i = 0; i < arrayOrigin.length; i++) {
			//если совпал первый элемент arraySub.
			if (arrayOrigin[i] == arraySub[0]) {
				int s;
				for (s = 0; s < arraySub.length; s++) {
					if (arraySub[s] != arrayOrigin[i+s]){
						break;
					}
				}
				//Если совпали все элементы  arraySub.
				if (s == arraySub.length) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
}