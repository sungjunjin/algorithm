package me.sj.algorithm.inflearn.bfs;

public class Node {
    private final int data;
    private Node right;
    private Node left;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
