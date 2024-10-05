public class PrintEvenIndex {
    public static void main(String[] args) {
        int[]arr = {2,4,3,2,1,2,3,4,6,6,9};
        int n = arr.length;
        int evencount = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                evencount++;
            }
        }
        System.out.println("the evencount is : " +evencount);
    }
}
