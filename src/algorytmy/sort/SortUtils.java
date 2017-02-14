package algorytmy.sort;

/**
 * Created by RENT on 2017-02-14.
 */
public class SortUtils {

    public static void swap(int[] array, int indexl, int index2) {
        int tmp = array[indexl];
        array[indexl] = array[index2];
        array[index2] = tmp;

    }

}
