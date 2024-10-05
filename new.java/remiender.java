import java.util.Scanner;
public class remiender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int rem = num1/num2;
        System.out.println("Remiender of given num is " + rem);
        
    }

    
}
