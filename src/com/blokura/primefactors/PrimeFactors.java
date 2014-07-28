package com.blokura.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imanol on 27/07/2014.
 */
public class PrimeFactors {

    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        if (n > 1) {
            while (n % 2 == 0) {
                primes.add(2);
                n /= 2;
            }
            if (n > 1) {
                primes.add(n);
            }

        }
        return primes;
    }


}
