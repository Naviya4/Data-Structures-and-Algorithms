package Array;

public class Array {
    private int[] array;
    private int length;

    // Constructor to initialize the array with a given capacity
    public Array(int capacity) {
        array = new int[capacity];
        length = 0; // Number of elements in the array
    }

    // 1. Print the array
    public void printArray() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // 2. Append an element to the array
    public void append(int value) {
        if (length >= array.length) {
            resizeArray();
        }
        array[length] = value;
        length++;
    }

    // 3. Remove the last element of the array
    public int removeLast() {
        if (length == 0) return -1; // Return -1 to indicate an empty array
        int value = array[length - 1];
        length--;
        return value;
    }

    // 4. Prepend an element to the array
    public void prepend(int value) {
        if (length >= array.length) {
            resizeArray();
        }
        for (int i = length; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
        length++;
    }

    // 5. Remove the first element of the array
    public int removeFirst() {
        if (length == 0) return -1;
        int value = array[0];
        for (int i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        length--;
        return value;
    }

    // 6. Get an element at a particular position
    public int get(int index) {
        if (index < 0 || index >= length) return -1; // Return -1 to indicate an invalid index
        return array[index];
    }

    // 7. Set an element at a particular position
    public boolean set(int index, int value) {
        if (index < 0 || index >= length) return false;
        array[index] = value;
        return true;
    }

    // 8. Insert an element at any position
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (length >= array.length) {
            resizeArray();
        }
        for (int i = length; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        length++;
        return true;
    }

    // 9. Remove an element at any position
    public int remove(int index) {
        if (index < 0 || index >= length) return -1;
        int value = array[index];
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        length--;
        return value;
    }

    // 10. Reverse the array
    public void reverse() {
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Helper method to resize the array when it gets full
    private void resizeArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
