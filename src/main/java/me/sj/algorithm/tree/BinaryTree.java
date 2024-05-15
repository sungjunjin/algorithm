package me.sj.algorithm.tree;

public class BinaryTree {

    public static class Node <T> {
        private T data;
        private Node left;
        private Node right;

        public T getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }
}
