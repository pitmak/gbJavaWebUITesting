package lesson4;

public class Triangle {

    /**
     * Функция вычисляет площадь треугольника по трем сторонам
     * @param a длина 1 стороны
     * @param b длина 2 стороны
     * @param c длина 3 стороны
     * @return double или NaN, если стороны треугольника некорректны
     */
    public static double areaOf(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) return Double.NaN;
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        System.out.println(Triangle.areaOf(1,1,1));
    }
}
