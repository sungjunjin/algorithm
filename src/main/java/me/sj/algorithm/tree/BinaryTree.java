package me.sj.algorithm.tree;

public class BinaryTree {
    public static class Node <T> {
        private T data;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void add(Node newNode) {
            if(this.left != null && this.right != null) {
                throw new IllegalArgumentException("node is full");
            }

            if(this.left == null) {
                this.left = newNode;
                return;
            }

            this.right = newNode;
        }

        public Node getNodeOrNull(T data) {
            if(data == null) {
                return null;
            }

            if(this.right != null && this.right.data.equals(data)) {
                return this.right;
            }

            if(this.left != null && this.left.data.equals(data)) {
                return this.left;
            }

            return null;
        }
    }
}
