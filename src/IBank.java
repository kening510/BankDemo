public interface IBank {
    void openAccount(Customer customer);
    void getLoan(Customer customer,Employee employee,double totalAmountLoan);
    void changeLoanInterest(Loan loan,double newLoanInterest,Employee employee);
}
