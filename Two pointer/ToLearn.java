public class ToLearn{
    public static void PrintArray(int[]brr){
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] +" ");
        }
        System.err.println();  
    
    }
    public static int[] SortArray(int[]arr){
        int n = arr.length;
        int left = 0 , right = n-1;
        int ans[] = new int[n];
        int k = n-1;

        while(left<= right){
            if(Math.abs(arr[left])>Math.abs(arr[right] )){
                ans[k] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k] = arr[right] * arr[right];
                right--;
            }
            k--;
        }
        return ans;
    }
        public static void main(String[] args) {
        int[]arr = {2,-3,-10,8,5,6,4};
        System.out.print("Original Array");
        PrintArray(arr);

        int[]ans = SortArray(arr);
        System.out.print("SqureArray is");
        PrintArray(ans);

        System.out.print("Updated aaray is");
        PrintArray(ans);
        }
        public static int[] reverseArray(int[]arr){
            for(int i = 0; i<arr.length-1; i++){
                for(int j = 0; j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                    }
                }
            }
            return arr;
        }
    }
