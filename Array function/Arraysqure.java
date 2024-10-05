 public class Arraysqure {
    static void squrearray(int[]arr){
        int n = arr.length;
         for(int i= 0; i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
            }
        }
        public static void main(String[] args) {
            int []arr = {2,3,4,5,6,8};
            squrearray(arr);
            for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }

}