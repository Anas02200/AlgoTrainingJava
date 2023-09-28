package org.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class BinaryToDecimalTest {


    @Test
    // Test converting binary to decimal
     void testBinaryToDecimal() {
        // zeros at the starting should be removed
        assertEquals(0, BinaryToDecimal.binaryToDecimal(0));
        assertEquals(1, BinaryToDecimal.binaryToDecimal(1));
        assertEquals(5, BinaryToDecimal.binaryToDecimal(101));
        assertEquals(63, BinaryToDecimal.binaryToDecimal(111111));
        assertEquals(512, BinaryToDecimal.binaryToDecimal(1000000000));
    }

    @Test
    // Test converting negative binary numbers
    void testNegativeBinaryToDecimal() {
        assertEquals(-1, BinaryToDecimal.binaryToDecimal(-1));
        assertEquals(-42, BinaryToDecimal.binaryToDecimal(-101010));
    }

    @Test
    // Test converting binary numbers with large values
     void testLargeBinaryToDecimal() {
        assertEquals(262144L, BinaryToDecimal.binaryToDecimal(1000000000000000000L));
        assertEquals(524287L, BinaryToDecimal.binaryToDecimal(1111111111111111111L));
    }
}
