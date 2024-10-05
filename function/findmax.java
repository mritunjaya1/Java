import java.util.Scanner;
public class findmax {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int[]arr= new int[size];
    int n = arr.length;
    System.out.println("Enter eliment");
    for(int i = 0; i<n; i++){
        arr[i]=sc.nextInt();

    }
    int max = arr[0];
    for(int i = 0; i<arr.length; i++){
          if(arr[i]>max){
            max=arr[i];
          }

    }
    System.out.println(" max eliment is"+max);



    
   } 
}
