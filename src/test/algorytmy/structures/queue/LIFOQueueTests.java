package test.algorytmy.structures.queue;

import algorytmy.structures.queue.LIFOQueue;
import algorytmy.structures.queue.Queue;
import algorytmy.structures.queue.QueueException;

/**
 * Created by RENT on 2017-02-20.
 */
public class LIFOQueueTests {
    public static void main(String[] args) {
        Queue queue = new LIFOQueue();
        queue.clone();
        try {
            queue.pop();
        }catch (QueueException e){
            e.printStackTrace();
        }
        System.out.println();

        queue.push(3);
        queue.push(4);
        queue.push(2);
        queue.push(1);
        System.out.println(queue);
    }
}
