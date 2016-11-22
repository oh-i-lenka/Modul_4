package Task_1;

public class BankSystemImpl implements BankSystem{

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfWithdrawal()){
            if (user.getBalance() - amount*(1+(float)user.getBank().getCommission(amount)/100) >= 0){
                user.setBalance(user.getBalance() - amount*(1+(float)user.getBank().getCommission(amount)/100));
                System.out.println("The operation of withdrawal money was successfully completed. New balance is "+user.getBalance() + " " + user.getBank().getBankCurrency());
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("The operation has cancelled by Bank emitent. The limit of withdrawal " + user.getBank().getLimitOfWithdrawal() + user.getBank().getBankCurrency());
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding() || user.getBank().getLimitOfFunding() == -1){
            user.setBalance(user.getBalance() + amount * (1-(float)user.getBank().getCommission(amount)/100));
            System.out.println("Your balance was successfully funded. New balance is " + user.getBalance() + " " + user.getBank().getBankCurrency());
        } else {
            System.out.println("The limit of funding has exceeded. The limit is " + user.getBank().getLimitOfFunding() +" " + user.getBank().getBankCurrency());
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount <= fromUser.getBank().getLimitOfWithdrawal() && amount <= toUser.getBank().getLimitOfFunding()){
            if (fromUser.getBalance() - amount * (1+(float)fromUser.getBank().getCommission(amount)/100) >= 0){
                fromUser.setBalance(fromUser.getBalance() - amount * (1+(float)fromUser.getBank().getCommission(amount)/100));
                toUser.setBalance(toUser.getBalance() + amount * (1 - (float)toUser.getBank().getCommission(amount)/100));
                System.out.println("Transfer money from " + fromUser.getName() + " to " + toUser.getName() + " " + amount + fromUser.getBank().getBankCurrency() + " complete!");
            } else System.out.println("Not enough money " + fromUser.getName() + ". Balance is " + fromUser.getBalance() + fromUser.getBank().getBankCurrency());
        } else {
            System.out.println("The operation has cancelled by Bank");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("You have received your salary. Your balance is " + user.getBalance() + user.getBank().getBankCurrency());
    }
}
