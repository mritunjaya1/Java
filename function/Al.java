import java.util.Scanner;


public class Al{
    public static int  Algebra(int a, int b){
        int ans = a+b;
       return  ans;

  
   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first value");
        int x = sc.nextInt();
        System.out.println("enter your second value");
        int y = sc.nextInt();
        int result = Algebra(x,y);
        System.out.println("sum of two number is: " +result);  
    }
}