import java.util.Scanner;
public class binarytodeci{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int binary_num=sc.nextInt();
        int ans=0;
        int pw=1;
        while(binary_num>0){
            int unit_digit= binary_num % 10;
            ans =ans+ (unit_digit*pw);
            binary_num = binary_num/10;
            pw = pw*2;
        }
        System.out.println(ans);
        
    }
    
}