public class findAverage {
    public static double Averagefind(int[]arr){
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
             sum +=arr[i];
        }
    
        return (double) sum / n;
    }
    public static void main(String[] args) {
        int[]arr ={2,3,4,5,1,2,34};
        double average = Averagefind(arr);
        System.out.println("Average of theis num is :" +average);
    }
}
