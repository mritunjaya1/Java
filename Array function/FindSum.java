import java.util.Scanner;
public class FindSum {
    public static int addArray (int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  eliment");
            int n= sc.nextInt();
             int[]arr = new int[n];
             for (int i = 0; i < n; i++) {
                System.out.println("Enter element " + (i + 1) + ":");
                arr[i] = sc.nextInt();
            }
            int sum = addArray(arr); // Call the method with the array
            System.out.println("Sum of these numbers is: " + sum);

    }
}

