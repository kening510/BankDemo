public class Employee extends Person {
    private double salary;

    public Employee(String name,String personalNr,double salary){
        super(name,personalNr);
        this.salary=salary;
    }

    public Employee(String name,String personalNr){
        super(name, personalNr);
    }



}
