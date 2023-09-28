package org.training;

import org.junit.jupiter.api.Test;
import org.training.HamiltonianCycle;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HamiltonianCycleTest {

    private final HamiltonianCycle hamiltonianCycle = new HamiltonianCycle();

    @Test
    void testFindHamiltonianCycleShouldReturnHamiltonianCycle() {
        int[] expectedArray = {0, 1, 2, 4, 3, 0};
        int[][] inputArray = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
        };

        assertArrayEquals(expectedArray, hamiltonianCycle.findHamiltonianCycle(inputArray));
    }

    @Test
    void testFindHamiltonianCycleShouldReturnInfinityArray() {
        int[] expectedArray = {-1, -1, -1, -1, -1, -1};

        int[][] inputArray = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
        };

        assertArrayEquals(expectedArray, hamiltonianCycle.findHamiltonianCycle(inputArray));
    }
}
