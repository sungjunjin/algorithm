package me.sj.algorithm.udemy.dfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static class Node {
        private int data;
        private ArrayList<Node> children = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }

        public void addChildren(ArrayList<Node> children) {
            this.children = children;
        }

        public void searchBreadthFirst(Node node) {
            Queue<Node> queue = new LinkedList<>();

            queue.add(node);

            while (!queue.isEmpty()) {
                Node next = queue.remove();

                System.out.println(next.data);

                queue.addAll(next.children);
            }
        }
    }
}
