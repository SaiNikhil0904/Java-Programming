import java.util.*;

public class Employee {
    int eId;
    String eName;
    float eSalary;

    Employee(int eId, String firstname, String lastname, float eSalary) {
        this.eId = eId;
        this.eName = firstname + " " + lastname;
        this.eSalary = eSalary;
    }

    static void getEmployee(int id, String firstname, String lastname, float sa, Employee[] e, int k) {
        e[k] = new Employee(id, firstname, lastname, sa);
    }

    static void showEmployees(int n, int x, Employee[] e) {
        Arrays.sort(e, (a, b) -> {
            if (b.eSalary != a.eSalary) {
                return Float.compare(b.eSalary, a.eSalary);
            } else {
                return Integer.compare(a.eId, b.eId);
            }
        });

        for (int l = 0; l < x; l++) {
            System.out.println("Employee Name : " + e[l].eName);
            System.out.println("Employee ID : " + e[l].eId);
            System.out.println("Employee Salary : " + e[l].eSalary);
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = obj.nextInt();
        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the EmployeeID: ");
            int id = obj.nextInt();
            System.out.print("Enter firstname: ");
            String fa = obj.next();
            System.out.print("Enter lastname: ");
            String la = obj.next();
            System.out.print("Enter Employee Salary: ");
            float sa = obj.nextFloat();
            getEmployee(id, fa, la, sa, e, i);
        }

        System.out.print("Enter the number of Employees needed: ");
        int x = obj.nextInt();
        showEmployees(n, x, e);
        obj.close();
    }
}