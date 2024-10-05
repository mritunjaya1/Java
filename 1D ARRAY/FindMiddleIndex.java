
import java.util.Scanner;

public class FindMiddleIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[]arr = new int [size];
        int n = arr.length;
        System.out.println("Enter eliment");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        int MiddleIndex=arr.length/2;
        System.out.println("Middile Index is: " + MiddleIndex);


    }
}
