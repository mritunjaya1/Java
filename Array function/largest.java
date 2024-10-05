public class largest {
    public static int FindLargest(int[]arr){
        int largest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>largest){
               largest = arr[i];
            }
        
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]arr = {2,4,3,2,3,4,12,43};
        int largest = FindLargest(arr);
        System.out.print("the largest eliment is : "+largest);

    }
}

