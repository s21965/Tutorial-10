package Task3;

public class Employee extends Person {

    public int hireDate;
    public String companyName;
    public double salary;


    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.companyName = companyName;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getAge() {
        return (2020-this.birthdayYear);
    }
    public int getJobSeniority() {
        return 2002-hireDate;
    }
}
