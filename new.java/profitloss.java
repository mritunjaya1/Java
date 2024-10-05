import java.util.*;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your cost price (CP):");
        int cp = sc.nextInt();
        
        System.out.println("Enter your selling price (SP):");
        int sp = sc.nextInt();
        
        if (cp > sp) {
            int loss = cp - sp;  
            System.out.println("You are in loss.");
            System.out.println("Your loss is: " + loss);
        } else if (cp < sp) {
            int profit = sp - cp;
            System.out.println("You are in profit.");
            System.out.println("Your profit is: " + profit);
        } else {
            System.out.println("You have no loss, no profit.");
        }

        
    }
}
