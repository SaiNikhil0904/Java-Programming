import java.util.*;

class InvalidNameException extends Exception {
}

class Main {
    void setName(String Name) {
        try {
            throw new InvalidNameException();
        } catch (Exception e) {
            System.out.println("Invalid Name");
        }
    }

    void setAge(int age) {
        if (age > 50) {
            try {
                throw new ArithmeticException("Exception");
            } catch (ArithmeticException e) {
                System.out.println("Invalid Age");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String Name = sc.nextLine();
        System.out.print("Enter age of the employee: ");
        int age = sc.nextInt();
        Main m = new Main();
        m.setName(Name);
        m.setAge(age);
    }
}