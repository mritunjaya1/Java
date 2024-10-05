public class posneg {
    public static void main(String[] args) {
        int[]arr={4,7,-2,-6,6,-4,3};
        int n = arr.length;
        
        int poscount=0;
        int negcount=0;
        for (int i = 0; i <n; i++) {
            if(arr[i]>=0){
                poscount++;  
            }
            if(arr[i]<0){
                negcount++;
            }
        }
        System.out.println("here  is the pos count:" + poscount);
        System.out.println(" here  is the neg:"+negcount);
    }
}
