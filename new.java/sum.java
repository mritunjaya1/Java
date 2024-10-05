
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum=0;
        System.out.println("Enter first value");
        int num1= sc.nextInt();
        System.out.println("Enter second value");
        int num2= sc.nextInt();
        sum=num1+num2;
        System.out.println("Sum of this num is "+ sum );

    }
}
