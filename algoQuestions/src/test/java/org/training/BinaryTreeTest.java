package org.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



@DisplayName("binary tree tests")
class BinaryTreeTest {

    // checks that adding populating the tree and searching for data
    // retrieves the expected data
    @Test
    @DisplayName("populating tree")
    void populatingTreeTest() {
        BinaryTree t = new BinaryTree();
        t.put(3);
        t.put(5);
        t.put(7);
        t.put(9);
        t.put(12);

        assertEquals(5, t.find(5).data);
        assertEquals(7, t.find(7).data);
    }

    // checks that removing data from the tree
    // properly removes and makes the new root the expected new root
    @Test
    @DisplayName("removing from tree")
    void removingFromTreeTest() {
        BinaryTree t = new BinaryTree();
        t.put(3);
        t.put(5);
        t.put(7);
        t.put(9);
        t.put(12);
        t.remove(3);
        t.remove(5);
        t.remove(7);

        assertEquals(9, t.getRoot().data);
    }

    // checks that removing an unexistend node returns false
    //  as specified by the documentation of the function
    @Test
    @DisplayName("removing inexistant from tree")
    void removingNonExistentFromTreeTest() {
        BinaryTree t = new BinaryTree();
        t.put(3);
        t.put(5);
        t.put(7);
        t.put(9);
        t.put(12);

        assertTrue(t.remove(9));
        assertFalse(t.remove(398745987));
    }

    // check if the bfs, inOrder, preOrder and postOrder functions
    // work as expected
    @Test
    @DisplayName("inorder / preorder / post order / bfs tree")
    void treeTraversalAndBrdfsearch() {
        BinaryTree t = new BinaryTree();
        t.put(3);
        t.put(5);
        t.put(7);
        t.put(9);
        t.put(12);

        t.bfs(t.find(12));
        t.inOrder(t.getRoot());
        t.preOrder(t.getRoot());
        t.postOrder(t.getRoot());

        assertTrue(t.remove(9));
        assertFalse(t.remove(398745987));
    }

}