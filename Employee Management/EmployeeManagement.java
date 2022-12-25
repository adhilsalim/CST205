import java.util.*;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    void printSalary(int salary) {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

class EmployeeManagement {
    public static void main(String[] arguments) {

        // Creating objects
        Officer officerOne = new Officer();
        Manager mangerOne = new Manager();
        Scanner scan = new Scanner(System.in);

        // Officer //
        System.out.println("Enter the name of the officer: ");
        officerOne.name = scan.nextLine();

        System.out.println("Enter the age of the officer: ");
        officerOne.age = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the phone number of the officer: ");
        officerOne.phoneNumber = scan.nextLine();

        System.out.println("Enter the address of the officer: ");
        officerOne.address = scan.nextLine();

        System.out.println("Enter the salary of the officer: ");
        officerOne.salary = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the specialization of the officer: ");
        officerOne.specialization = scan.nextLine();

        // Manager //
        System.out.println("Enter the name of the manager: ");
        mangerOne.name = scan.nextLine();

        System.out.println("Enter the age of the manager: ");
        mangerOne.age = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the phone number of the manager: ");
        mangerOne.phoneNumber = scan.nextLine();

        System.out.println("Enter the address of the manager: ");
        mangerOne.address = scan.nextLine();

        System.out.println("Enter the salary of the manager: ");
        mangerOne.salary = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the department of the manager: ");
        mangerOne.department = scan.nextLine();

        scan.close();

        // Printing the details of the officer and manager
        System.out.println("\n\nOfficer: ");
        System.out.print("NAME: " + officerOne.name + "\n" +
                "AGE: " + officerOne.age + "\n" +
                "PHONE NUMBER: " + officerOne.phoneNumber + "\n" +
                "ADDRESS: " + officerOne.address + "\n" +
                "SALARY: " + officerOne.salary + "\n" +
                "SPECIALIZATION: " + officerOne.specialization);

        System.out.println("\n\nManager: ");
        System.out.print("NAME: " + mangerOne.name + "\n" +
                "AGE: " + mangerOne.age + "\n" +
                "PHONE NUMBER: " + mangerOne.phoneNumber + "\n" +
                "ADDRESS: " + mangerOne.address + "\n" +
                "SALARY: " + mangerOne.salary + "\n" +
                "DEPARTMENT: " + mangerOne.department);
    }
}