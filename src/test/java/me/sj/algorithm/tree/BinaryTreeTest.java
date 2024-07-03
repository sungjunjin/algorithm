package me.sj.algorithm.tree;

import me.sj.algorithm.udemy.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeTest {
    BinaryTree.Node<String> rootNode = new BinaryTree.Node<>("root");

    @Test
    public void addTest() {
        BinaryTree.Node<String> newNode = new BinaryTree.Node<>("children");
        rootNode.add(newNode);

        assertThat(rootNode.getLeft()).isEqualTo(newNode);
    }

    @Test
    public void searchTest() {
        BinaryTree.Node<String> newNode = new BinaryTree.Node<>("children");
        rootNode.add(newNode);

        BinaryTree.Node result = rootNode.getNodeOrNull("children");

        assertThat(result).isEqualTo(newNode);
    }

    @Test
    public void searchFailTest() {
        BinaryTree.Node<String> newNode = new BinaryTree.Node<>("children");
        rootNode.add(newNode);

        BinaryTree.Node result = rootNode.getNodeOrNull("fail");

        assertThat(result).isNull();
    }
}