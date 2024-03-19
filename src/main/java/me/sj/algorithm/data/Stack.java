package me.sj.algorithm.data;

public class Stack<E> {
    private final Object[] data;

    // 스택의 가장 위 배열의 인덱스를 가진다
    private int top;

    public Stack()  {
        // 내부 배열 사이즈 10으로 할당
        data = new Object[10];
        this.top = 0;
    }

    public void push(E element) {
        data[top] = element;
        top++;
    }

    public E pop() {
        top = top - 1;
        E result = (E) data[top];
        data[top] = null;

        return result;
    }

    public E get(E element) {
        for(int i=0;i<data.length;i++) {
            if(data[i].equals(element)) {
                return (E) data[i];
            }
        }

        return null;
    }

    public Object[] getData() {
        return data;
    }

    public int getTop() {
        return top;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Object d : data) {
            result.append(" ").append(d);
        }

        return result.toString();
    }
}
