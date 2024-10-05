public class replaceInArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,2,3,2,1,2,3,21,2};
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                arr[i]=-1;
                
            }
        }
            System.out.println("New array is");
             for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");

    }
}
}

