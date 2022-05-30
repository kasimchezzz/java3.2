public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 2000;
        int z = x + y;
        int bonus = y / 100 ;
        int total = x + y + bonus ;
        if (y > 1000) {
            System.out.println("Баланс: " + total);
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            System.out.println("Баланс: " + z);
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