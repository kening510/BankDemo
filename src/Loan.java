public class Loan {
    private double capital;
    private double interest;
    private Employee approvedBy;
    private Employee lastInterestApprovedBy;

    public Loan(double capital, double interest, Employee approvedBy) {
        this.capital = capital;
        this.interest = interest;
        this.approvedBy = approvedBy;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public Employee getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Employee approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Employee getLastInterestApprovedBy() {
        return lastInterestApprovedBy;
    }

    public void setLastInterestApprovedBy(Employee lastInterestApprovedBy) {
        this.lastInterestApprovedBy = lastInterestApprovedBy;
    }
}
