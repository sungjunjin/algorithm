package me.sj.algorithm.bfs;

import me.sj.algorithm.dfs.BFS;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BFSTest {

    @Test
    public void searchBFSQueueTest() {
        BFS.Node root = new BFS.Node(5);
        ArrayList<BFS.Node> children = new ArrayList<>();
        children.add(new BFS.Node(9));
        children.add(new BFS.Node(10));

        BFS.Node child1 = new BFS.Node(6);

        ArrayList<BFS.Node> children2 = new ArrayList<>();
        children2.add(new BFS.Node(7));
        children2.add(new BFS.Node(8));
        children.add(child1);


        root.addChildren(children);
        child1.addChildren(children2);

        root.searchBreadthFirst(root);
    }
}