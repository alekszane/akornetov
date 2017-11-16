package ru.job4j.calculator;
/**
* Создаем класс калькулятор
*/
public class Calculator {
	/**
	 * Результат вычисления
	*/
	private double result;
    /**
     * Сумма
     */
	public void add(double first, double second) {
		this.result = first + second;
	}
    /**
     * Разность
     */
	public void subtract(double first, double second) {
		this.result = first - second;
	}
    /**
     * Деление
     */
	public void div(double first, double second) {
		this.result = first / second;
		}
    /**
     * Умножение
     */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
    /**
     * Получаем результат вычислений
     */
    public double getResult() {
        return this.result;
		}
}

