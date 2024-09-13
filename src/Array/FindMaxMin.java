package Array;

public class FindMaxMin {

    public static void findMaxMin(int[] arr) {
        // Initialize max and min variables
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
            if (arr[i] < min) {
                min = arr[i];  // Update min if current element is smaller
            }
        }

        // Print the largest and smallest elements
        System.out.println("The largest element is: " + max);
        System.out.println("The smallest element is: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, -1};

        findMaxMin(arr);
    }
}

