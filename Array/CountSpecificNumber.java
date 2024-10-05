public class CountSpecificNumber {
    public static void main(String[] args) {
        int[]arr = { 2,2,3,4,2,1,4,5,6};
        int n = arr.length;
        int target = 2;
        int specific  = 0;
        for(int i = 0; i<n; i++){

             if(arr[i]==2){
                specific++;
             }
        }
        System.out.println("here specific num is"+specific);
    }
}
