public class Swap{
    public static void printArray(int[]brr){
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
    }
    public static int[] SqrArray(int[]arr){
        int n = arr.length;
        int left = 0 , right = n-1;
        int[]ans = new int[n];
        int k = n-1;

    while(left <= right){
        if(Math.abs(arr[left]) > Math.abs(arr[right])){
           ans[k--] = arr[left] * arr[left];
           left++;
        }
        else{
            ans[k--] = arr[right] * arr[right];
            right--;
       
         }
        
    
 }
 return ans;
}
    public static void main(String[]args){
        int[]arr = {4,2,3,6,9,-10};
        System.out.print("Original Array: ");
        printArray(arr);

        int[]ans = SqrArray(arr);
        System.out.print("Squred array (unsorted)");
        printArray(ans);

        System.out.print("Sorted Squared Array: ");
        printArray(sortArray(ans));

    
     
    }
     static int[] sortArray(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
        }
        
   } return arr;
}
    
 }

