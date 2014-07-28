package com.blokura.primefactors;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.blokura.primefactors.PrimeFactors.generate;

public class PrimeFactorsTest extends TestCase {

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    public void testOne() throws Exception {
        assertEquals(list(), generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2), generate(2));
    }

    public void testThree() throws Exception {
        assertEquals(list(3), generate(3));
    }

    public void testFour() throws Exception {
        assertEquals(list(2,2), generate(4));
    }

    public void testSix() {
        assertEquals(list(2,3), generate(6));

    }

    public void testEight() {
        assertEquals(list(2,2,2), generate(8));
    }

    public void testNine() {
        assertEquals(list(3,3), generate(9));
    }

}