import java.util.Scanner;
public class findMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter size of array");
       int size = sc.nextInt();
       int n = sc.nextInt();
       int[]arr = new int [size];
       System.out.println("enter eliment");
       for(int i = 0; i<n; i++){
          arr[i]= sc.nextInt();
       }
       int[] result = findMinMax(arr);
       System.out.println("the min eliment is"+result[0]);
       System.out.println("the max eliment is"+result[1]);
   
    }

    public static int[]findMinMax(int[]arr){
    int min=arr[0];
    int max = arr[0];
    for(int i = 1; i<arr.length; i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max= arr[i];
        }


}
return new int[]{min,max};
}
}