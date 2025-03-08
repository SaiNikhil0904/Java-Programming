import java.util.*;

class EmployeeInfo {
    private String name;
    private String designation;

    EmployeeInfo(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Designation: ");
        String designation = sc.next();

        EmployeeInfo emp = new EmployeeInfo(name, designation);
        emp.display();
        sc.close();
    }
}