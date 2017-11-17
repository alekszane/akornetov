package ru.job4j.condition;
/**
 * Class Triangle
 * @author Aleksey Kornetov (all-1313@yandex.ru)
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    // Определяем точки
    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**Метод вычисления расстояния
     * @param left Точка слева
     * @param right Точка с права.
     * @return расстояние между точками left и right.
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(
                Math.pow(left.getX() - right.getX()) + Math.pow(left.getY() - right.getY()));
    }
    /** Метод вычисления периметра по длинам сторон
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Периметр.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac +bc) / 2;
    }
    /*
     * Метод должен вычислить прощадь треугольника.
     * @return Вернуть прощадь, если треугольник существует или -1.
    */
    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            //  формула для расчета площади треугольника.
            rsl = Math.sqrt( p *(p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
    /*
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return
    */
    private boolean exist(double ab, double ac, double bc) {
        if(ab + ac > bc && ac + bc > ab && ab + bc > ac && ab > 0 && ac > 0 && bc > 0){
            return true;
        }else{
            return false;
        }
    }
}