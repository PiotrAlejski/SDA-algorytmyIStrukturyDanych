package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-18.
 */
public abstract class AbstractQueue implements Queue {
    protected int value;

    protected AbstractQueue next;

    public AbstractQueue() {

    }

    protected AbstractQueue(int value) {
        this.value = value;
    }

    @Override
    public Queue clone() {
        AbstractQueue clonedQueue = getInstance();
        AbstractQueue toReturn = clonedQueue;
        AbstractQueue thisQueue = this.next;
        while (thisQueue != null) {
            clonedQueue.next = new LIFOQueue(thisQueue.value);
            clonedQueue = clonedQueue.next;
            thisQueue = thisQueue.next;
        }
        return toReturn;
    }

    protected abstract AbstractQueue getInstance();

    protected abstract AbstractQueue getInstance(int value);


    public int pop() {
        AbstractQueue nextValue = this.next;
        if (nextValue == null) {
            System.out.println("This queue is already empty");
            return 0;
        }
        this.next = nextValue.next;
        nextValue.next = null;
        return nextValue.value;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        AbstractQueue queue = this.next;
        stringBuilder.append("[");
        while (queue != null) {
            stringBuilder.append(queue.value);
            if (queue.next != null) {
                stringBuilder.append(", ");
            }
            queue = queue.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected AbstractQueue getLast() {
        AbstractQueue fifoqueue = this;
        while (fifoqueue.next != null) {
            fifoqueue = fifoqueue.next;
        }
        return fifoqueue;
    }
}
