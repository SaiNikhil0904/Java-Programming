import java.util.*;

public class Main {
    int numbers[];

    Main() {
        numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = 0;
        }
    }

    void setNumber(String index, String number) {
        int i = Integer.parseInt(index);
        if (i > 9 || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int n = Integer.parseInt(number);
        if (n < -32768 || n > 32767) {
            throw new IllegalArgumentException();
        }
        numbers[i] = n;
    }

    int getNumber(String index) {
        int i = Integer.parseInt(index);
        if (i > 9 || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return numbers[i];
    }

    public static void main(String args[]) {
        Main myException = new Main();
        String test[][] = {
            {"0", "12"},
            {"4", "34"},
            {"6", "10"},
            {"13", "4"},
            {"5", "abc"}
        };

        for (int i = 0; i < test.length; i++) {
            try {
                myException.setNumber(test[i][0], test[i][1]);
            } catch (Exception e) {
                System.out.println(e + " for data: " + test[i][0] + " " + test[i][1]);
            }
        }

        System.out.println();
        for (int i = 0; i < test.length; i++) {
            try {
                System.out.println("Output is: " + myException.getNumber(test[i][0]));
            } catch (Exception e) {
                System.out.println(e + " for index: " + test[i][0]);
            }
        }
    }
}