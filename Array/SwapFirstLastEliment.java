public  class SwapFirstLastEliment {
    public static void main(String[] args) {

        int[]arr={2,3,1,3,4,2,4,4};
        for(int i = 0; i<arr.length; i++){
       System.out.println("Brefor swap " +arr[i]);
        int n = arr.length;
        int firstindex= arr[0];
        int lastindex=n-1;
       
         int temp=arr[0];
         firstindex=arr.length-1;
         lastindex=temp;
         }
         System.out.println("after swap");
         for(int i = 0; i<arr.length; i++){
             System.out.print(" "+arr[i]);

         }
        }

        }

    
   
