package Array;

import java.util.HashSet;

// Find duplicate elements in an array
public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Iterate through the array
        for (int num : arr) {  // for-each loop which is used exclusively to loop through elements in an array
            if (!seen.add(num)) { // If the element is already in the set, it's a duplicate
                duplicates.add(num); // Add to duplicates set
            }
        }

        // Print the duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 5, 9};

        findDuplicates(arr);
    }
}

// Alternative Approaches:
//     Sorting (Time Complexity: O(n log n)): You can sort the array first and then iterate through it to find adjacent duplicate elements.
//     Brute Force (Time Complexity: O(n^2)): Check every element against every other element to find duplicates, but this is less efficient.

// Using a HashSet is an efficient and simple way to solve the problem of finding duplicates.
