import java.util.*;
public class Main{
    public static int[] pes(int[] arr){
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int output[]=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1; i<n; i++){
            left[i]=left[i-1]*arr[i-1];
        }
        for(int i=n-2; i>=0; i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<n; i++){
            output[i]=left[i]*right[i];
        }
        return output;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Main m=new Main();
        int output[]=m.pes(arr);
        for(int i: output){
            System.out.print(i+" ");
        }
    }
}
