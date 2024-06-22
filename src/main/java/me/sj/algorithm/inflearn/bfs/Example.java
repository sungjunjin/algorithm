package me.sj.algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 순회 (BFS)
 */
public class Example {
    public void init(Node root) {
        Node left = new Node(2);
        Node right = new Node(3);
        root.setLeft(left);
        root.setRight(right);
        left.setLeft(new Node(4));
        left.setRight(new Node(5));
        right.setLeft(new Node(6));
        right.setRight(new Node(7));
    }

    public static void main(String[] args) {
        Example example = new Example();

        Node root = new Node(1);
        example.init(root);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();

            System.out.print("level : " + level + "| ");

            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                System.out.print(node.getData() + " ");

                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }

            System.out.println();

            level++;
        }

    }
}
