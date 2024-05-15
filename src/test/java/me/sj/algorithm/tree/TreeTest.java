package me.sj.algorithm.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TreeTest {
    Tree.Node<String> rootNode = new Tree.Node<>("root");

    @Test
    public void addTest() {
        Tree.Node<String> newNode = new Tree.Node<>("children");
        rootNode.add(newNode);

        assertThat(rootNode.getChildren().size()).isEqualTo(1);
    }

    @Test
    public void searchTest() {
        Tree.Node<String> newNode = new Tree.Node<>("children");
        rootNode.add(newNode);

        Tree.Node result = rootNode.get("children");

        assertThat(result.getData()).isEqualTo("children");
    }

    @Test
    public void searchFailTest() {
        Tree.Node<String> newNode = new Tree.Node<>("children");
        rootNode.add(newNode);

        Tree.Node result = rootNode.get("fail");

        assertThat(result).isNull();
    }

}