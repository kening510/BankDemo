import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Loan> loanList = new ArrayList<>();
    private List<Account> accountList = new ArrayList<>();

    public Customer(String name, String personalNr) {
        super(name, personalNr);
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void addLoan(Loan loan) {
        loanList.add(loan);
    }

    public Loan getLoan() {
        return loanList.get(0);
    }


}
