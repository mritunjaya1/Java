
import java.lang.reflect.Array;

public  class oddeven {
public static void main(String[] args) {
     int[] arr = { 2,4,1,3,4};
    int n = arr.length;
    for(int i=0; i<arr.length;i++){
        if(arr[i]%2==0){
            System.out.println("this is even");
    
        }
        else{
            System.out.println("this is odd");
        }
    
    }
   
}
    
}