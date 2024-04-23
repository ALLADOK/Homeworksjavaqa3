
public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int amount = 5000;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;

            System.out.println("Пополнение: " + amount + " рублей");
            System.out.println("Начислено бонусов: " + bonus + " рублей");
        int total = balance + amount + bonus;
            System.out.println("Текущий счет: " + total + " рублей");
        } else if (amount < 1000) {
            bonus = 0;

            System.out.println("Пополнение: " + amount + " рублей");
            System.out.println("Начислено бонусов: " + bonus + " рублей");
        int total = balance + amount + bonus;
            System.out.println("Текущий счет: " + total + " рублей");
        }
    }
}