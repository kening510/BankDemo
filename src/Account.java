public class Account {
    private double balance;
    private double interest;

    public Account(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
