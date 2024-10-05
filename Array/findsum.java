public class findsum {
    public static void main(String[] args) {
        int[]arr = {12,45,55,2,321};
        int n = arr.length;
        int sum=0;
       for(int i = 0; i<n; i++){
        sum=sum+arr[i];
       }
       System.out.println("sum of these num is " +sum);
        

    }
}
