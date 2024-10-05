public class frequency {
    public static void main(String[] args) {
        int[]arr= {1,2,3,2,3,2,3,4};
        int target= 2;
        int frequency=1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                frequency++;
            }
           
    }
    System.out.println("frequency of "+ target+" of target is" +frequency);
}
}
