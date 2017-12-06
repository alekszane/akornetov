package ru.job4j.string;
/**
 * Created by All on 04.12.2017.
 */
<<<<<<< HEAD
public class Contains {
	/**
	 * @param origin оригинальная строка.
	 * @param sub строка в строке.
	 * @return true.
=======

public class Contains {
	/**
	 * @param origin
	 * @param sub
	 * @return true
>>>>>>> c21f47e133e68bdf441eee61c65381aca7a22e6a
	 */
	boolean contains(String origin, String sub) {
		char[] arrayOrigin = origin.toCharArray();
		char[] arraySub = sub.toCharArray();
		boolean result = false;

		for (int i = 0; i < arrayOrigin.length; i++) {
<<<<<<< HEAD
=======
			//если совпал первый элемент arraySub.
			if (arrayOrigin[i] == arraySub[0]) {
>>>>>>> c21f47e133e68bdf441eee61c65381aca7a22e6a
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
<<<<<<< HEAD
			return result;
		}
=======
		}
		return result;
	}
>>>>>>> c21f47e133e68bdf441eee61c65381aca7a22e6a
}