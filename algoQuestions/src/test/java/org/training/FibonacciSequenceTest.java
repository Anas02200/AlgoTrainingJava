package org.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.training.helpers.ConverterList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



@DisplayName("fibonacci tests")
class FibonacciSequenceTest {


    @ParameterizedTest(name = " {0} => ({1})")
    @CsvSource( delimiter = '|', textBlock = """
                                              1|1
                                              9|34
                                              10|55
                                              """)
    @DisplayName("fibonacci Nth number")
    void fiboShouldReturn(int number , int expected){


        int n = FibonacciSequence.fiboN(number);


        assertEquals(expected,n);


    }

    @ParameterizedTest(name = " {0} => ({1})")
    @CsvSource( delimiter = '|', textBlock = """
                                              1|0,1
                                              9|0,1,1,2,3,5,8,13,21,34
                                              10|0,1,1,2,3,5,8,13,21,34,55
                                              """)
    @DisplayName("fibonacci sequence until the Nth number")
    void fiboSequenceShouldReturn(int number , @ConvertWith(ConverterList.class) List<Integer> expected){


        List<Integer> n = FibonacciSequence.seqFiboN(number);


        assertEquals(expected,n);


    }


}