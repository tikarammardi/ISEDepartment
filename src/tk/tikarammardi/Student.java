package tk.tikarammardi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student  {
    Scanner input = new Scanner(System.in);
    private String name;
    private String USN;
    private String section;
    private int marks;

    public void deleteRecord() {

        this.name = null;
        this.USN = null;
        this.section=null;
        this.marks = 0;
    }


    void studentDisplay(){
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20d", name,USN,section,marks);
    }



    public void setName() {
        System.out.println("Enter Student Name\r");

        this.name = input.nextLine();
    }



    public void setUSN() {
        System.out.println("Enter Student USN\r");
        this.USN = input.nextLine();
    }

    public String getUSN() {
        return USN;
    }

    public void setSection() {
        System.out.println("Enter Student Section\r");
        this.section = input.nextLine();
    }



    public void setMarks()  {
        try {
            System.out.println("Enter Student Marks\r");
            this.marks = input.nextInt();
        }catch (InputMismatchException e) {
            System.out.println(" Invalid Input !!\nExpected Input is Integer");
        }

    }
}
