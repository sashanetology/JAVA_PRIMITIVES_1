public class Main {
    public static void main(String[] args) {

        int s = 333; // стоимость билета
        int m = 20; // количество рублей для 1 бонусной мили
        int b = s / m; // количество бонусных миль

        System.out.println("Вам начислено " + b + " бонусных миль");

    }
}