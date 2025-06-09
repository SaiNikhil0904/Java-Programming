import java.util.*;
public class Main
{
    public int[] sortzeroone(int[] arr) {
        int zero =0;
        int n=arr.length;
        int one=n-1;
        while(zero<one){
            if(arr[zero]==0){
                zero++;
            }else{
                int temp=arr[zero];
                arr[zero]=arr[one];
                arr[one]=temp;
                one--;
            }
        }
        return arr;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    Main m = new Main();
	    int[] sortedarr = m.sortzeroone(arr); 
	    for (int i : sortedarr) {
            System.out.print(i + " ");
        }
	}
}