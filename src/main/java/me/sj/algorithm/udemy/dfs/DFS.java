package me.sj.algorithm.udemy.dfs;


import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    public static class Node {
        private int data;
        private ArrayList<Node> children = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }

        public void addChildren(ArrayList<Node> children) {
            this.children = children;
        }

        public void searchDeptFirstRecursive(Node node) {
            if (node == null) {
                return;
            }

            System.out.println(node.data);

            for (Node child : node.children) {
                searchDeptFirstRecursive(child);
            }
        }

        public void searchDeptFirst(Node node) {
            Stack<Node> stack = new Stack<>();

            stack.push(node);

            while (!stack.empty()) {
                Node next = stack.pop();

                System.out.println(next.data);

                for (Node child : next.children) {
                    stack.push(child);
                }
            }
        }
    }
}
