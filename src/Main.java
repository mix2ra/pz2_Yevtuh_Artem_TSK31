public class Main {
    public static void main(String[] args) {
        // Вираз 13
        double a13 = -2.86, b13 = 1.62, c13 = 10.874, d13 = -2.91;
        double y13 = (Math.log(Math.abs(2 * d13))) / (3 * Math.tan(b13))
                - c13 / Math.sqrt(Math.abs(d13));
        System.out.println("Результат вираз 13 (y13): " + y13);

        // Вираз 14
        double a14 = 1.54, b14 = 0.49, c14 = 24.1, d14 = 0.87;
        double y14 = 2 * (Math.sin(a14) / Math.sqrt(Math.tan(b14 - a14))
                + Math.log(c14) / d14);
        System.out.println("Результат вираз 14 (y14): " + y14);

        // Вираз 15
        double a15 = 1.25, b15 = 3.09, c15 = 4.25, d15 = 0.56;
        double y15 = 2 * Math.sqrt(Math.tan(a15) / Math.acos(b15))
                - 3 * Math.cbrt(Math.exp(c15 - a15) * Math.sinh(d15));
        System.out.println("Результат вираз 15 (y15): " + y15);
    }
}
