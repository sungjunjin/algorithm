package me.sj.algorithm.udemy.data;

public class Queue<E> {
    private final Object[] data;

    // 큐의 첫번째 인덱스
    private int front;

    // 큐의 마지막 인덱스
    private int back;

    public Queue() {
        this.data = new Object[10];
    }

    public void add(E element) {
        data[back] = element;
        back = back + 1;
    }

    public E poll() {
        E result = (E) data[front];
        data[front] = null;
        front = front + 1;

        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Object d : data) {
            result.append(" ").append(d);
        }

        return result.toString();
    }

    public Object[] getData() {
        return data;
    }

    public int getFront() {
        return front;
    }

    public int getBack() {
        return back;
    }
}
