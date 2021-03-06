package algorytmy.sort;

/**
 * Created by RENT on 2017-02-14.
 */
public class SortUtils {

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
