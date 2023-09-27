package org.training;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {



    /* caculate the n th number of the fibonacci sequence defined as  : */
    public static int fiboN(int n ){

        int a = 0;
        int b = 1;
        int c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }

        return b;
    }
    /* caculate and return a list of the n th first numbers of the fibonacci sequence defined as  : */
    public static List<Integer> seqFiboN(int n ){


        List<Integer> seq = new ArrayList<>();
        seq.add(0);
        seq.add(1);
        int a = 0;
        int b = 1;
        int c;
        if (n == 0)
            return seq;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            seq.add(b);
        }

        return seq;
    }



}
