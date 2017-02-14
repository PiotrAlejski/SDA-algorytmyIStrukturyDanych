package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class CountingSort {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] array = {1,2,3,4,5,6,4,7,8,9,-5,-4,-3,-8,1,3,4,5,6,-1,4};
        System.out.println(Arrays.toString(countingSort.ascSort(array)));
    }

    public int[] ascSort(int[] array) {
        int max = SortUtils.max(array);
        int min = SortUtils.min(array);
            int range = max- min + 1;
        int[] rangeArray = new int[range];
        for (int i = 0; i < array.length; i++) {
            rangeArray[array[i] - min] ++;
        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = 0; j < rangeArray[i]; j++) {
                array[index] = i + min;
                index++;


            }
        }
        return array;
    }



    public int[] desc(int[] array) {
        return null;

    }
}
