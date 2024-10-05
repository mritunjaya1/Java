public class Swap {
    public static void SwapNumber(int[]arr){
        int temp = arr[0];
        arr[0] =  arr[1];
         arr[1] = temp;
    }   
public static void main(String[]args){
    int[]arr = new int [2];
     arr[0]=12;
     arr[1]=34;
     System.out.println("before Swap A : " +arr[0]);
     System.out.println("before Swap B : " +arr[1]);
     System.out.println( " ");
    SwapNumber(arr);

    System.out.println("After Swap A : " +arr[0]);
    System.out.println("After Swap B : " +arr[1]);


}
}

