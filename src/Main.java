public class Main {
    public static void main(String[] args) {

        int account = 100;
        int addMoney = 300;

        if (addMoney >= 1000) {
            int bonus = addMoney / 100;
            int money = account + bonus + addMoney;
            System.out.println("Бонус равен: " + bonus + ". Итоговая сумма на счету: " + money);
        } else {
            int money = account + addMoney;
            System.out.println("Бонусов нет. " + "Итоговая сумма на счету: " + money);
        }
    }
}
