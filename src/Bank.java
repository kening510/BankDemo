import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    private List<Customer> customerList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private final double initialAccountBalance = 0;
    private double initialInterest = 0;
    private double initialLoanInterest = 0.00145;


    @Override
    public void openAccount(Customer customer) {
        customerList.add(customer);
        Account account1 = new Account(initialAccountBalance,initialInterest);
        customer.addAccount(account1);
        System.out.println(customer.getName()+ " has opened an account." );
    }

    @Override
    public void getLoan(Customer customer, Employee employee, double totalAmountLoan) {
        Loan loan1 = new Loan(totalAmountLoan,initialLoanInterest,employee);
        customer.addLoan(loan1);
        System.out.println(customer.getName() + " has taken a loan " + totalAmountLoan + "kr approved by "
        + employee.getName() );
    }

    public void changeLoanInterest(Loan loan,double newLoanInterest,Employee employee){
        loan.setInterest(newLoanInterest);
        loan.setLastInterestApprovedBy(employee);
        System.out.println(employee.getName()+ " has changed the interest from " + initialLoanInterest +
                " to " + newLoanInterest);
    }
}
