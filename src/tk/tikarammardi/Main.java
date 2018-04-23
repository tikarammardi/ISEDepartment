package tk.tikarammardi;


import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student[] = new Student[20];
        Teacher teacher[] = new Teacher[20];

        boolean done = false;
        try {


        do {
            System.out.println("/----------------------Information Science and Engineering Management System ----------------------");
            System.out.println("----------------------Entry----------------------");


            System.out.println("1.Add New Teacher Information ");
            System.out.println("2.Add New Student Information ");
            System.out.println("3.Delete Student's Record");
            System.out.println("4.Delete Teacher's Record");
            System.out.println("5.Update Student's Record");
            System.out.println("6.Update Teacher's Record");
            System.out.println("7.Search Student");
            System.out.println("8.Search Teacher");
            System.out.println("9.Display Students Details");
            System.out.println("10.Display Teachers Details");
            System.out.println("11.EXIT");
            System.out.println("----------------------------------------------------------------------------------------------------");

            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("\nEnter your choice");

            int mainChoice = input.nextInt();
            String usn, empId;

            int maximumNumberOfTeacher = 0;
            int maximumNumberOfStudent = 0;




            switch (mainChoice) {
                case 1:
                   try {

                      System.out.println("---------------------------------------------------");
                      System.out.println("----------Enter Teacher Information-------------");
                      System.out.println("-------------------------------------------------");

                      System.out.println("Enter number of details");
                      maximumNumberOfTeacher = input.nextInt();

                      for (int i = 0; i < maximumNumberOfTeacher; i++) {

                          teacher[i] = new Teacher();

                          teacher[i].setName();
                          teacher[i].setEmployeeId();
                          teacher[i].setSalary();


                      }


                   }


              catch (NullPointerException e) {
                  System.out.println(e.getStackTrace());
              }
                    break;

                case 2:
                    try {
                        System.out.println("---------------------------------------------------");
                        System.out.println("----------Enter Student Information-------------");
                        System.out.println("---------------------------------------------------");

                        System.out.println("Enter Number of details to enter");
                        maximumNumberOfStudent = input.nextInt();
                        for (int i = 0; i < maximumNumberOfStudent; i++) {

                            student[i] = new Student();

                            student[i].setName();
                            student[i].setUSN();
                            student[i].setSection();
                            student[i].setMarks();


                        }
                    }

                    catch (NullPointerException e) {
                        System.out.println(e.getStackTrace());
                    }

                    break;

                case 3:

                    try {
                        System.out.println("Enter Student USN: ");
                        usn = input.nextLine();

                        for (int i = 0; i < maximumNumberOfStudent; i++) {
                            if (student[i].getUSN().equalsIgnoreCase(usn)) {
                                student[i].deleteRecord();
                            } else {
                                System.out.println("No Record with USN " + usn);
                            }
                        }
                    }
                    catch (NullPointerException e) {
                        System.out.println("\nNo. Record");
                    }


                    break;

                case 4:
                    try {
                        System.out.println("Enter Teacher EmployeeID: ");

                        empId = input.nextLine();
                        for (int i = 0; i < maximumNumberOfTeacher; i++) {
                            if (teacher[i].getEmployeeId().equalsIgnoreCase(empId)) {
                                teacher[i].deleteRecord();
                            } else {
                                System.out.println("No Record with EmployeeId " + empId);
                            }
                        }
                    }
                    catch (NullPointerException e) {
                        System.out.println("\nNo. Record");
                    }

                    break;

                case 5:
                    try {
                        System.out.println("Enter Student USN: ");
                        usn = input.nextLine();

                        for (int i = 0; i < maximumNumberOfStudent; i++) {
                            if (student[i].getUSN().equalsIgnoreCase(usn)) {
                                student[i].setName();
                                student[i].setSection();
                                student[i].setMarks();
                                System.out.println("-----------------------Record modified Successfully------------------------");
                            } else {
                                System.out.println("\nNo Record with USN" + usn);

                            }
                        }
                    }
                    catch (NullPointerException e) {
                        System.out.println("No. Record");
                    }
                    break;

                case 6:
                    try {
                        System.out.println("Enter Teacher EmployeeID: ");
                        empId = input.nextLine();
                        for (int i = 0; i < maximumNumberOfTeacher; i++) {
                            if (teacher[i].getEmployeeId().equalsIgnoreCase(empId)) {
                                teacher[i].setName();
                                teacher[i].setSalary();
                            } else {
                                System.out.println("No Record with EmployeeId " + empId);

                            }
                        }
                    }
                    catch (NullPointerException e) {
                        System.out.println("\nNo More Record");
                    }
                    break;

                case 7:
                    try {
                        System.out.println("Enter Student USN: ");
                        usn = input.nextLine();

                        for (int i = 0; i < maximumNumberOfStudent; i++) {

                            if (student[i].getUSN().equalsIgnoreCase(usn)) {

                                student[i].studentDisplay();
                            } else {
                                System.out.println("No Record with USN" + usn);
                                return;
                            }
                        }
                    }catch (NullPointerException e) {
                        System.out.println("\nNo More Record");
                    }

                    break;

                case 8:
                    try {
                        System.out.println("Enter Teacher EmployeeID: ");
                        empId = input.nextLine();
                        for (int i = 0; i < maximumNumberOfTeacher; i++) {
                            if (teacher[i].getEmployeeId().equalsIgnoreCase(empId)) {
                                teacher[i].teacherDisplay();
                            } else {
                                System.out.println("No Record with EmployeeId " + empId);
                            }
                        }
                    }

                    catch (NullPointerException e) {
                    System.out.println("\nNo Record");
                }
                    break;

                case 9:
                    try {
                        System.out.println("------------------------------Display Students Records------------------------------ ");
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.printf("%-20s%-20s%-20s%-20s", "NAME", "USN", "SECTION", "MARKS");
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------------------");
                        for (int i = 0; i < student.length; i++) {
                            student[i].studentDisplay();
                        }
                    }catch (NullPointerException e){
                        System.out.println("\nNo Info. to Display");
                    }
                    break;

                case 10:
                    try {
                        System.out.println("Display Teachers Records ");
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.printf("%-20s%-20s%-20s", "NAME", "EMPLOYEE-ID", "SALARY");
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------------------");
                        for (int i = 0; i < teacher.length; i++) {
                            teacher[i].teacherDisplay();
                        }
                    }
                    catch (NullPointerException e) {
                        System.out.println("\nNo Info. to Display");
                    }

                    break;
                case 11:
                    done = true;
                    break;
                default:
                    System.out.println("Enter valid choice");

            }
        } while (!done);

    }catch(NullPointerException e){
            System.out.println(e.getStackTrace());
        }


    }
}
