package me.sj.algorithm.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {
    @Test
    public void rightAddTest() {
        int rootData = 5;
        BinarySearchTree.Node rootNode = new BinarySearchTree.Node(rootData);

        int data = 6;
        rootNode.add(rootNode, data);

        assertThat(rootNode.getRight().getData()).isEqualTo(data);
        assertThat(rootNode.getLeft()).isNull();

    }

    @Test
    public void leftAddTest() {
        int rootData = 5;
        BinarySearchTree.Node rootNode = new BinarySearchTree.Node(rootData);

        int data = 1;
        rootNode.add(rootNode, data);

        assertThat(rootNode.getLeft().getData()).isEqualTo(data);
        assertThat(rootNode.getRight()).isNull();

    }

    @Test
    public void searchTest() {
        int rootData = 5;
        BinarySearchTree.Node rootNode = new BinarySearchTree.Node(rootData);

        rootNode.add(rootNode, 6);
        rootNode.add(rootNode, 7);

        BinarySearchTree.Node result = rootNode.getNodeOrNull(rootNode, 7);

        assertThat(result.getData()).isEqualTo(7);
    }

    @Test
    public void searchNullTest() {
        int rootData = 5;
        BinarySearchTree.Node rootNode = new BinarySearchTree.Node(rootData);

        rootNode.add(rootNode, 6);
        rootNode.add(rootNode, 7);

        BinarySearchTree.Node result = rootNode.getNodeOrNull(rootNode, 8);

        assertThat(result).isNull();
    }
}