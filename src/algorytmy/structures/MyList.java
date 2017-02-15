package algorytmy.structures;

/**
 * Created by RENT on 2017-02-15.
 */
public class MyList {
    private final int INITIAL_SIZE = 10;
    private int[] array;
    private int size;

    public MyList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }

    public void put(int index, int value) {
        if (checkIndex(index)) {
            this.array[index] = value;
        }
    }

    public void add(int index, int value) {
        if (checkIndex(index)) {
            if (size >= array.length) {
                doubleCapacity();
            }
            for (int i = size; i > index ; i--) {
                this.array[i] = this.array[i-1];
            }
            this.size++;
            this.array[index] = value;
        }
    }

    public int get(int index) {
        if (checkIndex(index)) {
            return array[index];
        } else {
            System.out.println("Wrong index");
            return 0;
        }
    }

    public void add(int value) {
        if (size >= array.length) {
            doubleCapacity();
        }
        array[size] = value;
        size++;

    }

    private boolean checkIndex(int index) {
        return index >= 0 && index > size;
    }

    private void swap(int index1, int index2) {
        int tmp= this.array[index1];
        this.array[index1] = this.array[index2];
        this.array[index2] = tmp;
    }

    public void delete(int index){
        if (checkIndex(index)) {
            for (int i = index ; i < size - 1; i++) {
               array[i] = array[i + 1];
            }
            size --;
        }
    }

    public MyList clone() {
        MyList tmplist = new MyList();
        tmplist.array = rewrite(new int[this.array.length]);
        tmplist.size = this.size;
        return tmplist;
    }

    private void doubleCapacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewrite(tmpArray);
    }

    private int[] rewrite(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            if (i != size -1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
