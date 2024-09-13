package Array;

import java.util.HashSet;
import java.util.Arrays;

// Remove duplicate elements in an array
public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the array to the HashSet
        for (int num : arr) {
            set.add(num);  // HashSet automatically ignores duplicates
        }

        // Convert the HashSet back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray; // Return the array with unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5, 3, 6};

        // Call the removeDuplicates method
        int[] result = removeDuplicates(arr);

        // Print the unique elements array
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}

