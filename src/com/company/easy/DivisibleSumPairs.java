package com.company.easy;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int divisibleSumPairsCount = 0;

        for (int i=0; i<n; i++) {

            for (int j=i+1; j<n; j++) {

                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    divisibleSumPairsCount++;
                }
            }
        }
        return divisibleSumPairsCount;

    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 9, 4, 2, 15, 11);
        int count = DivisibleSumPairs.divisibleSumPairs(integerList.size(), 4, integerList);
        System.out.println("Divisible pairs count: " + count);

    }



}
