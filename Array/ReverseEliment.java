
import java.util.Scanner;

public class ReverseEliment {
    public static void main(String[] args) {
        int[]arr = {3,4,7,8,9,8};
        System.out.println("Original Array");
        for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int start = 0;
       int end = arr.length-1;
       while(start<end){
          int temp= arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;

       }
       System.out.println("reversed array is");
       for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i] + " ");
       }
}
    
    
}
