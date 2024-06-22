package me.sj.algorithm.inflearn.dfs;

/**
 * DFS 순회
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
    public void DFS(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.getData());
        DFS(node.getLeft());
        DFS(node.getRight());

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Example example = new Example();
        example.init(root);

        example.DFS(root);
    }
}
