import java.util.Scanner;
public class CheckSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
         int[] arr = new int [size];
         int n = arr.length;
         System.out.println("Enter eliment");
         for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
         }
         if (isSorted(arr)) {
           System.out.println("Sorted");
         }
         else{
            System.out.println("Not Sorted");
         }

    }
    public static boolean isSorted(int[] arr) {
        for(int i = 1; i<arr.length; i++){
           if(arr[i]<arr[i-1]){
            return false;
           } 
        }
        return true;
    }
   }
        
    
    

