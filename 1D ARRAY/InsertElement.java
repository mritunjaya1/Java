import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();

        
        int[] arr = new int[size];
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position to insert the element (0 to " + size + "):");
        int position = sc.nextInt();

        System.out.println("Enter the element to insert:");
        int element = sc.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        
        int[] arr1 = new int[size + 1];

        
        for (int i = 0; i < arr1.length; i++) {
            if (i < position) {
                arr1[i] = arr[i];
            } else if (i == position) {
                arr1[i] = element;
            } else {
                arr1[i] = arr[i - 1]; 
            }
        }

        
        System.out.println("Array after insertion: " + Arrays.toString(arr1));
    }
}
