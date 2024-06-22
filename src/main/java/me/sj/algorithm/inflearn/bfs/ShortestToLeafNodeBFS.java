package me.sj.algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 말단 노드까지의 가장 짧은 경로 (BFS)
 */
public class ShortestToLeafNodeBFS {
    public static void main(String[] args) {
        ShortestToLeafNodeBFS shortest = new ShortestToLeafNodeBFS();
        Node root = new Node(1);
        shortest.init(root);
        System.out.println(shortest.bfs(root));
    }

    public void init(Node root) {
        Node left = new Node(2);
        Node right = new Node(3);
        root.setLeft(left);
        root.setRight(right);
        left.setLeft(new Node(4));
        left.setRight(new Node(5));
    }


    public int bfs(Node root) {
        int level = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNodeCnt = queue.size();
            // 레벨 탐색
            for (int i = 0; i < levelNodeCnt; i++) {
                Node node = queue.poll();

                if (node.getLeft() == null && node.getRight() == null) {
                    return level;
                }

                if (node.getRight() != null) {
                    queue.offer(node.getLeft());
                }

                if (node.getLeft() != null) {
                    queue.offer(node.getRight());
                }
            }
            level++;
        }

        return 0;
    }
}
