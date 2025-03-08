import java.io.*;
import java.util.*;

public class Student {
    int roll;
    String firstname;
    String lastname;
    String name;
    double marks;

    Student(int roll, String firstname, String lastname, double marks) {
        this.roll = roll;
        this.firstname = firstname;
        this.lastname = lastname;
        this.name = firstname + " " + lastname;
        this.marks = marks;
    }

    static void showDetails(int n, Student[] s) {
        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + s[i].name);
            System.out.println("Roll no : " + s[i].roll);
            System.out.println("Marks : " + s[i].marks);
            System.out.println();
        }
    }

    static void showTopStudents(int n, int x, Student[] s) {
        Arrays.sort(s, (a, b) -> Double.compare(b.marks, a.marks));
        for (int k = 0; k < x; k++) {
            System.out.println("Name :" + s[k].name);
            System.out.println("Rollno :" + s[k].roll);
            System.out.println("Marks :" + s[k].marks);
            System.out.println();
        }
    }

    static void showLowestStudent(Student[] s, int n) {
        Arrays.sort(s, (a, b) -> Double.compare(a.marks, b.marks));
        System.out.println("Name " + s[0].name);
        System.out.println("Rollno " + s[0].roll);
        System.out.println("Marks " + s[0].marks);
    }

    static void showSameStudents(Student[] s, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].firstname.equals(s[j].firstname)) {
                    System.out.println("Name " + s[i].name);
                    System.out.println("Rollno " + s[i].roll);
                    System.out.println("Marks " + s[i].marks);
                    System.out.println();
                    System.out.println("Name " + s[j].name);
                    System.out.println("Rollno " + s[j].roll);
                    System.out.println("Marks " + s[j].marks);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = obj.nextInt();

        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the rollno: ");
            int r = obj.nextInt();
            System.out.print("Enter firstname: ");
            String fa = obj.next();
            System.out.print("Enter lastname: ");
            String la = obj.next();
            System.out.print("Enter marks: ");
            double ma = obj.nextDouble();
            s[i] = new Student(r, fa, la, ma);
        }

        System.out.println("\nSelect");
        System.out.println("1. ShowDetails");
        System.out.println("2. ShowTopStudents");
        System.out.println("3. ShowLowestStudent");
        System.out.println("4. ShowSameStudents");
        System.out.print("Enter choice: ");
        int choice = obj.nextInt();

        switch (choice) {
            case 1:
                showDetails(n, s);
                break;
            case 2:
                System.out.print("Enter the number of top students needed: ");
                int x = obj.nextInt();
                showTopStudents(n, x, s);
                break;
            case 3:
                showLowestStudent(s, n);
                break;
            case 4:
                showSameStudents(s, n);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        obj.close();
    }
}