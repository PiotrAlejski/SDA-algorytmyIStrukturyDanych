package algorytmy.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = { -3, -4, 1, 3, -2, 1, 0, 3, 5, 06};
        int [] sortedArray = bubbleSort.ascSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
    public int[] descSort(int[] array) {
            int counter = 0;
            boolean flag = true;
            for (int i = 0; i < array.length ; i++) {
                flag = true;
                for (int j = 0; j < array.length -1 -i ; j++) {
                    counter ++;
                    if(array[j]<array[j+1] ){
                        SortUtils.swap(array, j, j + 1 );
                        flag = false;
                    }

                }
                if (flag) {
                    break;
                }
            }
            System.out.println(counter);
            return array ;
    }

    public int[] ascSort(int[] array) {
        int counter = 0;
       boolean flag = true;
        for (int i = 0; i < array.length ; i++) {
            flag = true;
            for (int j = 0; j < array.length -1 -i ; j++) {
                counter ++;
                if(array[j]>array[j+1] ){
                    SortUtils.swap(array, j, j + 1 );
                    flag = false;
                }

            }
            if (flag) {
             break;
            }
        }
        System.out.println(counter);
        return array ;
    }




}
