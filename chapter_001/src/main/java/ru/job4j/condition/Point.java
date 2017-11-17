package ru.job4j.condition;

public class Point {
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean is(int a, int b) {return true;}//(this.y == this.x * a + b) ? true : false;}
}

