import java.util.*;

class NotGoodLengthException extends Exception {
}

class Main {
    void solution(String S) {
        if (S.length() < 10) {
            try {
                throw new NotGoodLengthException();
            } catch (Exception e) {
                System.out.println("NotGoodLengthException");
            }
        } else {
            System.out.println(S.length());
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of length greater than 10: ");
        String S = sc.nextLine();
        Main m = new Main();
        m.solution(S);
    }
}