import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade");
        int grade = sc.nextInt();
        if (grade>90) {
            System.out.println("your grade is a++");
            
        }
        if (grade>70 & grade<90) {
            System.out.println("your grade is a");
        } 
        if (grade>45 & grade<70) {
            System.out.println("your grade is a++");
        } 
        if (grade< 45){
            System.out.println(" you are fail");
        }
    
    }

        
    }
    

