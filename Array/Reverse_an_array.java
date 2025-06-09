import java.util.*;
public class Main{
    public static int[] reversearr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        return arr;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int reverse[] = reversearr(arr);
        for(int i: reverse){
            System.out.print(i+" ");
        }
    }
}