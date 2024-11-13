package PR2.tut5;

public class QuickSort extends IntSortingAlgorithm {
    public QuickSort(String name, int[] array) {
        super(name, array);
    }
    public void quickSort (int[] array, int left, int right) {
        if (left < right) {
            int pos = partition (array, left, right);
            quickSort(array, left, pos -1);
            quickSort(array, pos + 1, right);
        }
    }

    public int partition (int[] array, int left, int right) {
        int down = left;
        int up = right;
        int pivot = array[left];
        while (down < up) {
            while (down < right && array[down] <= pivot) {down++;}
            while (up > left && array[up] > pivot) {up--;}
            if (down < up) {
                int tmp = array[down];
                array[down] = array[up];
                array[up] = tmp;
            }
        }
        array[left] = array[up];
        array[up] = pivot;
        return up;
    }
    @Override
    public void sort() {
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        quickSort(sortedArray, 0, array.length - 1);
        // Update sortedArray in the superclass after sorting
        setSortedArray(sortedArray);
    }
}
