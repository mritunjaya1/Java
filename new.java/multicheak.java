import java.util.Scanner;
public class multicheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num bro");
        int num = sc.nextInt();
        int n =1;
        while(true){
           if(num%5==0 && num%7==0) {
            System.out.println("found ans"+num);
            break;
           }
           num++;
        }

        
    }
}
