package me.sj.algorithm.inflearn.dfs;

/**
 * 말단 노드까지의 가장 짧은 경로 (DFS)
 */
public class ShortestToLeafNodeDFS {
    public static void main(String[] args) {
        ShortestToLeafNodeDFS shortest = new ShortestToLeafNodeDFS();
        Node root = new Node(1);
        shortest.init(root);

        System.out.println(shortest.solution(root));
    }

    public void init(Node root) {
        Node left = new Node(2);
        Node right = new Node(3);
        root.setLeft(left);
        root.setRight(right);
        left.setLeft(new Node(4));
        left.setRight(new Node(5));
    }

    public int solution(Node root) {
        int answer = 0;
        return dfs(answer, root);
    }

    public int dfs(int level ,Node node) {
        if(node.getRight() == null && node.getLeft() == null) {
            return level;
        }

        return Math.min(dfs(level + 1, node.getLeft()), dfs(level + 1, node.getRight()));
    }
}
