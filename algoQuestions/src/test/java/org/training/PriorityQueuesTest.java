package org.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriorityQueuesTest {

    @Test
    void testPQInsertion() {
        PriorityQueue myQueue = new PriorityQueue(4);
        myQueue.insert(2);
        Assertions.assertEquals(myQueue.peek(), 2);

        myQueue.insert(5);
        myQueue.insert(3);
        Assertions.assertEquals(myQueue.peek(), 5);

        myQueue.insert(10);
        Assertions.assertEquals(myQueue.peek(), 10);
    }

    @Test
    void testPQDeletion() {
        PriorityQueue myQueue = new PriorityQueue(4);
        myQueue.insert(2);
        myQueue.insert(5);
        myQueue.insert(3);
        myQueue.insert(10);

        myQueue.remove();
        Assertions.assertEquals(myQueue.peek(), 5);
        myQueue.remove();
        myQueue.remove();
        Assertions.assertEquals(myQueue.peek(), 2);
    }

    @Test
    void testPQExtra() {
        PriorityQueue myQueue = new PriorityQueue(4);
        Assertions.assertTrue(myQueue.isEmpty());
        Assertions.assertFalse(myQueue.isFull());
        myQueue.insert(2);
        myQueue.insert(5);
        Assertions.assertFalse(myQueue.isFull());
        myQueue.insert(3);
        myQueue.insert(10);
        Assertions.assertFalse(myQueue.isEmpty());
        Assertions.assertTrue(myQueue.isFull());

        myQueue.remove();
        Assertions.assertEquals(3, myQueue.getSize());
        Assertions.assertEquals(5, myQueue.peek());
        myQueue.remove();
        myQueue.remove();
        Assertions.assertEquals(2, myQueue.peek());
        Assertions.assertEquals(1, myQueue.getSize());
    }
}
