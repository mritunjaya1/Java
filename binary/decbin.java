import java.util.Scanner;

public class decbin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        int binaryNum = 0;
        int power = 1;

        while (decimalNum > 0) {
            int parity = decimalNum % 2;
            binaryNum += (parity * power);
            power *= 10;
            decimalNum /= 2;
        }

        System.out.println("Binary representation: " + binaryNum);
        
    }
}
