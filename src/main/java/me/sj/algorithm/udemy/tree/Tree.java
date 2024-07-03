package me.sj.algorithm.udemy.tree;

import java.util.ArrayList;

public class Tree {
    public static class Node<T> {
        private final T data;
        private final ArrayList<Node> children = new ArrayList<>();

        public Node(T data) {
            this.data = data;
        }

        public void add(Node node) {
            this.children.add(node);
        }

        public Node getNodeOrNull(T data) {
            for(Node node: children) {
                if(node.getData().equals(data)) {
                    return node;
                }
            }

            return null;
        }

        public T getData() {
            return data;
        }

        public ArrayList<Node> getChildren() {
            return children;
        }
    }

}
