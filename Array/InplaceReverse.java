public class InplaceReverse {
    public static void main(String[] args) {
        int[]arr= {4,6,2,8,9};
       System.out.print(" Original Array ");
       for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
       }
       System.out.println();
        int n = arr.length;
        int j = n-1;
        for( int i = 0;  i<j; i++){
            int temp= arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            j--;
        }
        System.out.print("reversed array is " );
       for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
}

