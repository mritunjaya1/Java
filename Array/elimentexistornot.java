public class elimentexistornot {
    public static void main(String[] args) {
        int[]arr = { 2,2,3,4,2,1,4,5,6};
        int n = arr.length;
        int target = 610;
        boolean found = false;

        for(int i = 0; i<n; i++){
             if(arr[i]==target){
                found=true;
                break;

            }
        }
        if (found) {
            System.out.println("Yes, " + target + " exists in the array.");
        } else {
            System.out.println("No, " + target + " does not exist in the array.");
        }
    }
       
}

