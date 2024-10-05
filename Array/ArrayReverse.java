import java.util.Scanner;
public class ArrayReverse {
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        
        int[] arr = new int[size]; 
        System.out.println("Enter elements of the array:");

    
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] reversed = reverseArray(arr);

    
        System.out.println("Reversed array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        
        
    }
}


