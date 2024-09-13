package Array;

public class FindTwoLargest {

    public static void findTwoLargest(int[] arr) {
        // Initialize variables to hold the largest and second-largest elements
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is greater than first
            if (arr[i] > first) {
                second = first;  // Update second to be the previous first
                first = arr[i];  // Update first to the current element
            }
            // If the current element is not greater than first but greater than second
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];  // Update second to the current element
            }
        }

        // Print the two largest elements
        System.out.println("The largest element is: " + first);
        System.out.println("The second largest element is: " + second);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        findTwoLargest(arr);
    }
}
