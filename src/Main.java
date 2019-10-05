public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Anna", "9906089876");
        Customer customer2 = new Customer("Kalle", "8709028776");
        Customer customer3 = new Customer("Emma", "5608210987");

        Employee employee1 = new Employee("John", "6709108829");
        Employee employee2 = new Employee("Hanna", "8803120032");

        IBank bank1 = new Bank();
        bank1.openAccount(customer1);
        bank1.getLoan(customer1, employee1, 100_000);

        bank1.openAccount(customer2);
        bank1.getLoan(customer2, employee1, 200_000);

        bank1.openAccount(customer3);
        bank1.getLoan(customer3, employee2, 300_000);

        bank1.changeLoanInterest(customer1.getLoan(),0.00144,employee1);
        bank1.changeLoanInterest(customer2.getLoan(),0.00133,employee2);








    }
}
