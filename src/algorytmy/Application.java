package algorytmy;

import algorytmy.structures.MyList;

/**
 * Created by RENT on 2017-02-14.
 */
public class Application {
    public static void main(String[] args) {
        MyList myList = initMylist();
        MyList cloneList = myList.clone();
        System.out.println(myList.clone());
        cloneList.add(5,16);
        cloneList.put(5,16);
        System.out.println(cloneList);
        cloneList.delete(12);



    }

    private static MyList initMylist() {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(-3);
        myList.add(-2);
        myList.add(-1);
        myList.add(-4);
        myList.add(-1);
        myList.add(0);
        myList.add(6);
        myList.add(-5);
        return myList;
    }
}
