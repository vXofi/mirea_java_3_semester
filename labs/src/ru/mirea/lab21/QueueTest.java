package ru.mirea.lab21;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueueModule arrayQM = ArrayQueueModule.getInstance();
        arrayQM.enqueue("Example");
        arrayQM.enqueue("Number");
        arrayQM.enqueue("One");
        System.out.println(arrayQM.dequeue());

        ArrayQueueADT adt = new ArrayQueueADT(arrayQM);
        System.out.println(adt.dequeue());

        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.dequeue());
    }
}
