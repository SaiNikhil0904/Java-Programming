import java.util.*;
public class Main{
    public int fibonacci(int n){
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int a=0, b=1, c=0;
        for(int i=2; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Main m=new Main();
        int a=m.fibonacci(n);
        System.out.print(a);
    }
}
