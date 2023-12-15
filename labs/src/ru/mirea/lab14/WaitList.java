package ru.mirea.lab14;

import java.text.CollationKey;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public void add(E element) {
        content.add(element);
    }

    public E remove() {
        return content.remove();
    }

    public boolean contains(E element) {
        return content.contains(element);
    }

    public boolean containsAll(Collection<E> elements) {
        return content.containsAll(elements);
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> elements) {
        content = new ConcurrentLinkedQueue<>(elements);
    }

    @Override
    public String toString(){
        return content.toString();
    }
}

