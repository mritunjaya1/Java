import java.util.Scanner;

public class SortArray {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  

    public static void Arraysort(int[] arr) {
        int n = arr.length;
        int zeroIndex = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                swap(arr, i, zeroIndex);
                zeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arraysort(arr);

        
        System.out.println("Updated array is:");
        System.out.println("New array is: " + java.util.Arrays.toString(arr));
    }
}

    
    
         
    


