package Task_1;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        if (this.getBankCurrency() == Currency.USD)
            return 1000;
        else {
            return 1200;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getBankCurrency() == Currency.USD)
            return 999999999; //требует правки!!
        else {
            return 10000;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getBankCurrency() == Currency.USD)
            return 1;
        else {
            return 2;
        }
    }

    @Override
    int getCommission(int summ) {

        if (this.getBankCurrency() == Currency.USD )
            if (summ <= 1000)
                return 5;
            else return 7;
        else {
            if (summ <= 1000)
                return 6;
            else return 8;
        }
    }
}
