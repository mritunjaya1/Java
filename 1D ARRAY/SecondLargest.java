public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 7, 5, 6};
        int secondLargest = findSecondLargest(arr);
        
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest is " + secondLargest);
        } else {
            System.out.println("Does not have any distinct elements");
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; 
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest; 
                firstLargest = num; 
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num; 
            }
        }

        return secondLargest;
    }
}

