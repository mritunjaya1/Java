public class CheakFrequency {
    public static int cheakfreqency(int[]arr, int eliment){
        int frequency = 0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]== eliment){
                frequency++;
            }
        }
        return frequency;
    }
            public static void main(String[] args) {
                int[]arr={2,3,2,3,2,1,2,4,5};
                 int element = 2;
                 int frequency = cheakfreqency(arr, element);
                System.out.print("frequency is : " +frequency);
            }
}
