package tk.tikarammardi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher {
    private String name;
    private String employeeId;
    private double salary;

    /*@Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", input=" + input +
                '}';
    }*/

    Scanner input = new Scanner(System.in);


    void teacherDisplay(){
        System.out.println();
        System.out.printf("%-20s%-20s%-20f", name, employeeId, salary);
    }


    public void deleteRecord() {
                this.name= null;
                this.employeeId=null;
                this.salary=0.0d;

    }

    public String getName() {
        return name;
    }

    public void setName() {

        System.out.println("Enter Teacher Name\r");

        this.name =input.nextLine();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId() {
        System.out.println("Enter Teacher Employee Id\r");

        this.employeeId = input.nextLine();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        try {
            System.out.println("Enter Teacher Salary\r");
            this.salary = input.nextDouble();
        }catch (InputMismatchException e) {
            System.out.println(" Invalid Input Expecting Salary");
        }


    }
}
