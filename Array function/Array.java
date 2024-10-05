import java.util.Scanner;

public class Array{
    public static int Calculatesum(int a, int b){
    int sum = a+b;
    return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first eliment");
        int a= sc.nextInt();
        System.out.println("Enter second eliment");
        int b= sc.nextInt();

        int sum = Calculatesum(a, b);
        System.out.println("Sum of these number is"+sum);

    }

}

