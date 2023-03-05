public class Main {
    public static void main(String[] args) {

        int cost = 333; // стоимость билета
        int precondition = 20; // количество рублей для 1 бонусной мили
        int bonus = cost / precondition; // количество бонусных миль

        System.out.println("Вам начислено " + bonus + " бонусных миль");

    }
}