package PR2.tut5;

import java.util.Arrays;

public class IntSortingAlgorithmTest {
    public static void testSortingAlgorithm(String algorithmName, int[] array, IntSortingAlgorithm sortingAlgorithm) {
        System.out.println("Testing " + algorithmName + ":");
        System.out.println("Original Array: " + Arrays.toString(array));

        // Clone the array to keep the original for comparison
        int[] originalArray = array.clone();

        // Apply the sorting algorithm
        sortingAlgorithm.sort();

        // Print the sorted array and check if it's sorted
        System.out.println(algorithmName + " Sorted Array: " + sortingAlgorithm.toString());
        System.out.println("Is Sorted? " + Arrays.equals(originalArray, sortingAlgorithm.getSortedArray()));

        // Restore the original array for the next test
        sortingAlgorithm.setArray(originalArray);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        BubbleSort bubbleSort = new BubbleSort("Bubble Sort", arr.clone());
        testSortingAlgorithm("Bubble Sort", arr.clone(), bubbleSort);

        QuickSort quickSort = new QuickSort("Quick Sort", arr.clone());
        testSortingAlgorithm("Quick Sort", arr.clone(), quickSort);

        MergeSort mergeSort = new MergeSort("Merge Sort", arr.clone());
        testSortingAlgorithm("Merge Sort", arr.clone(), mergeSort);
    }
}