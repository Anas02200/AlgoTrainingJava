package org.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.utils.Node;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTest {

    private Node<String> root;
    private BreadthFirstSearch<String> bfs;

    // Tree structure:
    //
    //        A
    //      / | \
    //     B  C  D
    //    / \
    //   E   F

    @BeforeEach
    public void setUp() {
        // nodes declaration
        root = new Node<>("A");

        var nodeB = new Node<>("B");
        var nodeC = new Node<>("C");
        var nodeD = new Node<>("D");

        var nodeE = new Node<>("E");
        var nodeF = new Node<>("F");

        // tree initialization
        root.addChild(nodeB);
        root.addChild(nodeC);
        root.addChild(nodeD);

        nodeB.addChild(nodeE);
        nodeB.addChild(nodeF);

        // create an instance to monitor the visited nodes
        bfs = new BreadthFirstSearch<>();
    }

    @Test
     void testSearchRoot() {
        String expectedValue = "A";
        List<String> expectedPath = List.of("A");

        // check value
        Optional<Node<String>> value = bfs.search(root, expectedValue);
        assertEquals(expectedValue, value.orElse(new Node<>("")).getValue());

        // check path
        assertArrayEquals(expectedPath.toArray(), bfs.getVisited().toArray());
    }

    @Test
     void testSearchF() {
        String expectedValue = "F";
        List<String> expectedPath = List.of("A", "B", "C", "D", "E", "F");

        // check value
        Optional<Node<String>> value = Optional.of(bfs.search(root, expectedValue).orElse(new Node<>(null)));
        assertEquals(expectedValue, value.get().getValue());

        // check path
        assertArrayEquals(expectedPath.toArray(), bfs.getVisited().toArray());
    }

    @Test
    void testSearchNull() {
        List<String> expectedPath = List.of("A", "B", "C", "D", "E", "F");
        Optional<Node<String>> node = bfs.search(root, null);

        // check value
        assertTrue(node.isEmpty());

        // check path
        assertArrayEquals(expectedPath.toArray(), bfs.getVisited().toArray());
    }

    @Test
    void testNullRoot() {
        var value = bfs.search(null, "B");
        assertTrue(value.isEmpty());
    }

    @Test
    void testSearchValueThatNotExists() {
        List<String> expectedPath = List.of("A", "B", "C", "D", "E", "F");
        var value = bfs.search(root, "Z");

        // check that the value is empty because it's not exists in the tree
        assertTrue(value.isEmpty());

        // check path is the whole list
        assertArrayEquals(expectedPath.toArray(), bfs.getVisited().toArray());
    }
}