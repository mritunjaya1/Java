import java.util.Scanner;
public class findminimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        int[] arr = new int [size];
        int n = arr.length;
        System.out.println(" Enter " + size + " eliment ");
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();     
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
         if(arr[i]<min){
            min=arr[i];
        }
       
    }
    System.out.println(" MINIMUM ELIMENT IS" + min );
    }
    
}
