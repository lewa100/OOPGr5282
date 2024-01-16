package SRP;

import java.util.Date;

public class Accountant extends Employee {

    public Accountant(String name, Date dob, int baseSalary) {
        super(name, dob, baseSalary);
    }

    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
