import java.util.Scanner;

public class findPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Enter size:");
        int size = sc.nextInt();
        
        
        int[] arr = new int[size];
        
        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter target sum:");
        int target = sc.nextInt();
        
        int ans = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        
        // Output the result
        System.out.println("Number of pairs with sum " + target + " is: " + ans);
    }
}
