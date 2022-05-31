public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 2000;
        int no_bonus = balance + payment;
        int bonus = payment / 100;
        int total = balance + payment + bonus;
        if (payment > 1000) {
            System.out.println("Баланс: " + total);
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            System.out.println("Баланс: " + no_bonus);
            System.out.println("Количество бонусных рублей: " + 0);
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}