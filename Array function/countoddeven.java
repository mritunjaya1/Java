import java.util.Scanner;
public class countoddeven {
    public static void countoddevens(int[]arr){
         int evencount =0;
         int oddcount = 0;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i]%2==0){
            evencount++;
          }
          else{
            oddcount++;
          }
      }
          System.out.println("Evencount is"+evencount);
          System.out.println("odd is"+oddcount);
        }
           public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.print("enter size");
              int size = sc.nextInt();
              int[]arr = new int [size];
              System.out.println("Enter eliment");
              for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
              }
                countoddevens(arr);
              }
          }
      
    


