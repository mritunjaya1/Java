public class ArrayCopy {
    public static void main(String[] args) {
        int[]arr= {2,3,4,5,5,4,3,2,1};
        int n = arr.length;
        int[]arr1 = new int[n];
        for(int i= 0; i< n; i++) {
            arr1[i] = arr[i];
            
        }
        System.out.println("COPY array is: "); 
        for(int i = 0; i<n; i++){
             System.out.print(arr[i] + " ");
        }
    }
    
}
