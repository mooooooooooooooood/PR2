package PR2.tut5;

import java.util.Arrays;

public class IntSortingAlgorithm {
    public String name;
    public int[] array;
    public int[] sortedArray;
    public IntSortingAlgorithm(){
    }
    public IntSortingAlgorithm(String name, int[] array) {
        this.name = name;
        this.array = array;
        this.sortedArray = new int[array.length];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return Arrays.copyOf(this.array, this.array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getSortedArray() {
        return Arrays.copyOf(this.sortedArray, this.sortedArray.length);
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = Arrays.copyOf(sortedArray, sortedArray.length);
    }

    public void sort() {
        int max, pos;
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        for (int i = array.length-1; i > 0; i--) {
            max = sortedArray[i];
            pos = i;
            for (int j = i - 1; j>= 0; j--) {
                if (sortedArray[j] > max) {
                    max = sortedArray[j];
                    pos = j;
                }
            }
            sortedArray[pos] = sortedArray[i];
            sortedArray[i]= max;
        }
    }

    public boolean isSorted() {
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i - 1] > sortedArray[i]) {
                return false;
            }
        }
        return true;
    }
    public String toString() {
        return Arrays.toString(sortedArray);
    }
}
