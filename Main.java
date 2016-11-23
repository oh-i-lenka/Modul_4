package Task_1;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
        EUBank Erstebank = new EUBank(1234567890, "Österreich", Currency.EUR, 455, 2859, 5, 987654321);
        EUBank DeutcheBank = new EUBank(1123456789, "Deutchland", Currency.USD, 1095, 3300, 4, 555885321);
        USBank ManhattanBank = new USBank(1213456789, "USA",Currency.EUR, 295, 3000, 5, 987654320);
        USBank WashingtonBank = new USBank(1231456789, "USA", Currency.USD, 598, 3500, 3, 987654312);
        ChinaBank BeijingBank = new ChinaBank(1234156789, "China",Currency.EUR, 2698, 1900, 3, 987654132);
        ChinaBank ChinesischBank = new ChinaBank(1234516789, "China",Currency.USD, 5008, 2150, 5, 987651432);

        User Person1 = new User(1111111111, "Birgit", 10000, 12, "LimeSoda GMBH", 4500, Erstebank);

        User Person2 = new User(222222222, "Petra", 5000, 1, "Schwarzkopf", 2920, DeutcheBank);

        User Person3 = new User(333333333, "David", 5000, 52, "Wallmart", 3560, ManhattanBank);

        User Person4 = new User(444444444, "Sam", 5200, 15, "Amazon", 2500, WashingtonBank);

        User Person5 = new User(555555555, "Jao", 60000, 52, "ChinaAirlines", 2800, BeijingBank);

        User Person6 = new User(666666666, "Xiaoly", 85000, 65, "ChinaGoods", 2100, ChinesischBank);

        BankSystemImpl moneyOperations = new BankSystemImpl();

        System.out.println(Person5.toString());

        moneyOperations.withdrawOfUser(Person6, 100);
        moneyOperations.fundUser(Person4, 10000);
        moneyOperations.paySalary(Person3);
        moneyOperations.transferMoney(Person1, Person2, 1000);
    }
}
