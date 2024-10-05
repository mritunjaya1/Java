public class MoveEvenArray {
    
    public static void evenFirst(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            
            while (left < right && arr[right] % 2 == 1) {
                right--;
            }
            
            if (left < right) {
                swap(arr, left, right);
            }
        }
    }

    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 8, 7, 10, 15, 2};
        System.out.println("Original array:");
        printArray(arr);

        evenFirst(arr);
        
        System.out.println("Array after moving evens to the front:");
        printArray(arr);
    }
}
