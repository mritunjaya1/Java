public class EvenFirst {
    public static void firsteven(int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
           
        while(left<right){
            if(arr[left] % 2 !=0  && (arr[right] % 2 == 0 )){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;  
            }  
            if(arr[left]%2==0){
                left++;
        
            }
            if(arr[right]%2!=0){
                right--; 
            }       
        }
       
}

            public static void main (String[]args){
              int[]arr = {2,5,7,3,4,1,9,6,4,2};
              firsteven(arr);
              System.out.println("UPDATED ARRAY IS");
              for (int i = 0; i < arr.length; i++) {
                System.out.print( arr[i] +" ");
            }
        }     
}
            
               