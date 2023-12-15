package ru.mirea.lab21;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {

    private LinkedList<Object> queue;


    public LinkedQueue(){
        queue = new LinkedList<>();
        head = tail = 0;
    }

    @Override
    public Object dequeue() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return  queue.remove(head);
    }

    @Override
    public Object element() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return  queue.get(head);     }

    @Override
    public void enqueue(Object o) {
        queue.add(o);
        tail++;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    @Override
    public boolean clear() {
        boolean r = ! isEmpty();
        queue.clear();
        head = tail = 0;
        return r;
    }
}