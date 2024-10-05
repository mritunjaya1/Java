
import java.util.Scanner;
public class sumcalculate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int[]arr=new int [size];
        System.out.println("enter array " + size + " eliment: ");
        int sum= 0;
        int n= arr.length;
        for(int i = 0; i<n;i++){
        arr[i]=sc.nextInt();
        
        sum=sum+arr[i];
           
        }
         System.out.println("sum of these num is"+sum);
}
    }

    
    

