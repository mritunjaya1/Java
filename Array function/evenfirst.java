public class evenfirst {
    public static void evenFirst(int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

         while(left<right){
            if(arr[left] %2==1 && arr[right] %2==0){
         
           int temp = arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
            left++;
            right--;
            }
            
            if (arr[left]%2==0){
               left++;
            }
            if (arr[right]%2==1){
                right--;
             }
            }
    }
             public static void main(String[]args){

                int[]arr={2,4,1,3,6,7,9,4,2};

             for(int i = 0; i<arr.length; i++){
                evenFirst(arr);
                System.out.print(arr[i] + " ");
             }

         }

    }

