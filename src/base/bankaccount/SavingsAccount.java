package base.bankaccount;

public class SavingsAccount extends Account{

    private double annualInt;

    public SavingsAccount(int id, double startBal, double annualInterestRate) {
        super(id, startBal);
        annualInt = annualInterestRate;
    }

    public double withdraw (double amt) {
        if (currentBalance() >= amt) {
            decreaseBalance(amt);
            return amt;
        } else {
            return 0;
        }
    }

    @Override
    public double monthlyInterest(){
        return currentBalance() * (annualInt/12);
    }

}
