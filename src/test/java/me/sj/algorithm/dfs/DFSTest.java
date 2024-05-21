package me.sj.algorithm.dfs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class DFSTest {

    @Test
    public void searchDFSRecursiveTest() {
        DFS.Node root = new DFS.Node(5);
        ArrayList<DFS.Node> children = new ArrayList<>();
        children.add(new DFS.Node(9));
        children.add(new DFS.Node(10));

        DFS.Node child1 = new DFS.Node(6);
        ArrayList<DFS.Node> children2 = new ArrayList<>();
        children2.add(new DFS.Node(7));
        children2.add(new DFS.Node(8));
        children.add(child1);


        root.addChildren(children);
        child1.addChildren(children2);

        root.searchDeptFirstRecursive(root);
    }

    @Test
    public void searchDFSStackTest() {
        DFS.Node root = new DFS.Node(5);
        ArrayList<DFS.Node> children = new ArrayList<>();
        children.add(new DFS.Node(9));
        children.add(new DFS.Node(10));

        DFS.Node child1 = new DFS.Node(6);
        ArrayList<DFS.Node> children2 = new ArrayList<>();
        children2.add(new DFS.Node(7));
        children2.add(new DFS.Node(8));
        children.add(child1);


        root.addChildren(children);
        child1.addChildren(children2);

        root.searchDeptFirst(root);
    }
}