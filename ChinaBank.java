package Task_1;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency bankCurrency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, bankCurrency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {

        if (this.getBankCurrency() == Currency.USD)
            return 100;
        else {
            return 150;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getBankCurrency() == Currency.USD)
            return 10000;
        else {
            return 5000;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getBankCurrency() == Currency.USD)
            return 1;
        else {
            return 0;
        }
    }

    @Override
    int getCommission(int summ) {

        if (this.getBankCurrency() == Currency.USD)
            if (summ <= 1000)
                return 3;
            else return 5;
        else {
            if (summ <= 1000)
                return 10;
            else return 11;
        }
    }
}
