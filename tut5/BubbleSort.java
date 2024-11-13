package PR2.tut5;
public class BubbleSort extends IntSortingAlgorithm{
    public BubbleSort (String name, int[] array) {
        super(name, array);
    }
    @Override
    public void sort() {
        int n = array.length;
        System.arraycopy(array, 0, sortedArray, 0, n);
        for (int i = 0; i <= n-2; i++) {
            for (int j =0; j <= n-i-2; j++) {
                if (sortedArray[j] > sortedArray[j+1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = tmp;
                }
            }
        }
        // Update sortedArray in the superclass after sorting
        setSortedArray(sortedArray);
    }
}
