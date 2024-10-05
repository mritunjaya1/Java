import java.util.Scanner;

public class multi {
    public static int multiplayArray(int a,int b){
        int multi = a*b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first eliment");
        int a= sc.nextInt();
        System.out.println("Enter second eliment");
        int b= sc.nextInt();

        int multi= multiplayArray(a, b);
        System.out.println("multiplay of these number is " +multi);

    }

}

