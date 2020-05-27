package Task3;

public class Manager extends Employee {
    public double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }


    public double getSalary() {
        return salary+bonus;
    }

    @Override
    public String toString(){
        return "Manager with lastname " + lastName + " and age " + getAge() + " has salary " + getSalary();
    }
}
