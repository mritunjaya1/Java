import java.util.Scanner;
public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[]arr= new int [size];
        int n = arr.length;
        System.out.println("Enter eliment");
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
           
        }
        int evencount=0;
        int oddcount=0;
         for(int i = 0; i< arr.length; i++){
         if(arr[i]%2==0){
            evencount++;
         }
         if(arr[i]%2!=0){
            oddcount++;
       }
         }
       System.out.println("the evencount is"+evencount);
       System.out.println("the oddcount is"+oddcount);

    }
}


