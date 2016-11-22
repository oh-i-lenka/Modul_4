package Task_1;

 abstract class Bank {
        long id;
        String bankCountry;
        private Currency bankCurrency;
        int numberOfEmployees;
        double avrSalaryOfEmployee;
        long rating;
        long totalCapital;

     public Bank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
         this.id = id;
         this.bankCountry = bankCountry;
         this.numberOfEmployees = numberOfEmployees;
         this.avrSalaryOfEmployee = avrSalaryOfEmployee;
         this.rating = rating;
         this.totalCapital = totalCapital;
     }

     Bank(){
     }

     abstract int getLimitOfWithdrawal();
     abstract int getLimitOfFunding();
     abstract int getMonthlyRate();
     abstract int getCommission(int summ);
     private double moneyPaidMonthlyForSalary(){
         System.out.println("Money paid monthly for salary" + numberOfEmployees*avrSalaryOfEmployee);
         return (numberOfEmployees*avrSalaryOfEmployee);
     }

     @Override
     public String toString() {
         return ("Bank " + "id=" + this.id + ", bankCountry= " + this.bankCountry);
     }

     public Currency getBankCurrency() {
         return bankCurrency;
     }

     public void setBankCurrency(Currency bankCurrency) {
         this.bankCurrency = bankCurrency;
     }
 }


