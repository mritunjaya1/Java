public class PrintEvenIndex { 
    public static void printEvenIndex(int[] arr) {
        System.out.print("Values at even indices are: ");
        for (int i = 0; i < arr.length; i += 2) { 
            System.out.print(arr[i] + " "); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 9, 4, 6, 9, 6};
        printEvenIndex(arr); 
    }
}
