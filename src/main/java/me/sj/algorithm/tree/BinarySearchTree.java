package me.sj.algorithm.tree;

public class BinarySearchTree {
    public static class Node {
        private int data;
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

        public void add(Node startNode, int data) {
            if (data >= startNode.data) {
                if (startNode.right == null) {
                    startNode.right = new Node(data);;
                } else {
                    add(startNode.right, data);
                }
            } else {
                if (startNode.left == null) {
                    startNode.left = new Node(data);;
                } else {
                    add(startNode.left, data);
                }
            }
        }

        public Node getNodeOrNull(Node startNode, int data) {
            if(startNode == null) {
                return null;
            }

            if(data == startNode.data) {
                return startNode;
            }

            if(data > this.data) {
                return getNodeOrNull(startNode.right, data);
            }

            if(data < this.data) {
                return getNodeOrNull(startNode.left, data);
            }

            return null;
        }
        /**
         * 전위 순회
         */
        public void traversePreOrder(Node node) {

            if(node == null) {
                return;
            }
            System.out.println(node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

        /**
         * 중위 순회
         */
        public void traverseInOrder(Node node) {

            if(node == null) {
                return;
            }

            traverseInOrder(node.left);
            System.out.println(node.data);
            traverseInOrder(node.right);
        }

        /**
         * 후위 순회
         */
        public void traversePostOrder(Node node) {

            if(node == null) {
                return;
            }

            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(node.data);
        }
    }
}
