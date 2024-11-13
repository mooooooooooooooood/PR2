package PR2.tut5;

public class MergeSort extends IntSortingAlgorithm {
    public MergeSort(String name, int[] array) {
        super(name, array);
    }
    public void mergeSort (int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid +1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge (int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    @Override
    public void sort() {
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        mergeSort(sortedArray, 0, sortedArray.length - 1);
        // Update sortedArray in the superclass after sorting
        setSortedArray(sortedArray);
    }
}
