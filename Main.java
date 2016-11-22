package Task_1;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
        EUBank Erstebank = new EUBank(1234567890, "Österreich", 455, 2859, 5, 987654321);
        EUBank DeutcheBank = new EUBank(1123456789, "Deutchland", 1095, 3300, 4, 555885321);
        USBank ManhattanBank = new USBank(1213456789, "USA", 295, 3000, 5, 987654320);
        USBank WashingtonBank = new USBank(1231456789, "USA", 598, 3500, 3, 987654312);
        ChinaBank BeijingBank = new ChinaBank(1234156789, "China", 2698, 1900, 3, 987654132);
        ChinaBank ChinesischBank = new ChinaBank(1234516789, "China", 5008, 2150, 5, 987651432);

        User Person1 = new User(1111111111, "Birgit", 10000, 12, "LimeSoda GMBH", 4500, Erstebank);
        Person1.bank.setBankCurrency(Currency.EUR);
        User Person2 = new User(222222222, "Petra", 5000, 1, "Schwarzkopf", 2920, DeutcheBank);
        Person2.bank.setBankCurrency(Currency.USD);
        User Person3 = new User(333333333, "David", 5000, 52, "Wallmart", 3560, ManhattanBank);
        Person3.bank.setBankCurrency(Currency.EUR);
        User Person4 = new User(444444444, "Sam", 5200, 15, "Amazon", 2500, WashingtonBank);
        Person4.bank.setBankCurrency(Currency.USD);
        User Person5 = new User(555555555, "Jao", 60000, 52, "ChinaAirlines", 2800, BeijingBank);
        Person5.bank.setBankCurrency(Currency.EUR);
        User Person6 = new User(666666666, "Xiaoly", 85000, 65, "ChinaGoods", 2100, ChinesischBank);
        Person6.bank.setBankCurrency(Currency.USD);

        BankSystemImpl moneyOperations = new BankSystemImpl();

        System.out.println(Person1.toString());

        moneyOperations.withdrawOfUser(Person6, 50);
        moneyOperations.fundUser(Person4, 1000000);
        moneyOperations.paySalary(Person3);
        moneyOperations.transferMoney(Person1, Person2, 1000);
    }
}
