
import java.util.Scanner;

public class area {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius");
    int radius;
    radius=sc.nextInt();
    float pi = 3.14f;
    float area = pi* radius* radius;
    System.out.println("the area of circle is"+area);
   } 
}
