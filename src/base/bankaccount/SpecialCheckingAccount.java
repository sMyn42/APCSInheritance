package base.bankaccount;

public class SpecialCheckingAccount extends CheckingAccount{

    private double annualInt;
    private double minBalance;

    public SpecialCheckingAccount (int id, double startBal, double cc, double annualInterestRate, double minBal) {
        super(id, startBal, cc);
        this.minBalance = minBal;
        this.annualInt = annualInterestRate;
    }

    @Override
    public void clearCheck (double amount) {
        if (currentBalance() > minBalance){
            decreaseBalance(amount);
        } else {
            super.clearCheck(amount);
        }
    }

    @Override
    public double monthlyInterest () {
        if (currentBalance() > minBalance){
            return currentBalance() * (annualInt/12);
        } else {
            return super.monthlyInterest();
        }
    }

}
