public class findminimum {
    public static int minimumfind(int[]arr){
     int minimum = arr[0];
     for (int i = 1; i < arr.length; i++) {
        if(arr[i]<minimum){
            minimum= arr[i];
         }
     }
    return minimum;
}
    public static void main(String[] args) {
        int[]arr =  {2,4,3,2,1,2,4,3};
        int minimum = minimumfind(arr);
        System.out.println("maximum num is: "+ minimum);
    }
}

