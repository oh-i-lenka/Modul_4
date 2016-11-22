package Task_1;

public class BankSystemImpl implements BankSystem{

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfWithdrawal()){
            if (user.getBalance() - amount*(1+(float)user.getBank().getCommission(amount)/100) >= 0){
                user.setBalance(user.getBalance() - amount*(1+(float)user.getBank().getCommission(amount)/100));
                System.out.println("The operation of withdrawal money was successfully completed. New balance is "+user.getBalance() + " " + user.bank.getBankCurrency());
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("The operation has cancelled by Bank emitent. The limit of withdrawal " + user.getBank().getLimitOfWithdrawal() + user.bank.getBankCurrency());
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding()){
            user.setBalance(user.getBalance() + amount * (1-(float)user.getBank().getCommission(amount)/100));
            System.out.println("Your balance was successfully funded. New balance is " + user.getBalance() + " " + user.bank.getBankCurrency());
        } else {
            System.out.println("The limit of funding has exceeded. The limit is " + user.getBank().getLimitOfFunding() +" " + user.bank.getBankCurrency());
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount <= fromUser.getBank().getLimitOfWithdrawal() || amount <= toUser.getBank().getLimitOfFunding()){
            if (fromUser.getBalance() - amount * (1+(float)fromUser.getBank().getCommission(amount)/100) >= 0){
                fromUser.setBalance(fromUser.getBalance() - amount * (1+(float)fromUser.getBank().getCommission(amount)/100));
                System.out.println("Отправитель  "+fromUser.getBalance());
                toUser.setBalance(toUser.getBalance() + amount * (1 - (float)toUser.getBank().getCommission(amount)/100));
                System.out.println("Получатель  "+toUser.getBalance());
                System.out.println("Transfer money from " + fromUser.name + " to " + toUser.name + " " + amount + fromUser.bank.getBankCurrency() + " complete!");
            } else System.out.println("Not enough money " + fromUser.name + ". Balance is " + fromUser.getBalance() + fromUser.bank.getBankCurrency());
        } else {
            System.out.println("The operation has cancelled by Bank");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.salary);
        System.out.println("You have received your salary. Your balance is " + user.getBalance() + user.bank.getBankCurrency());
    }
}
