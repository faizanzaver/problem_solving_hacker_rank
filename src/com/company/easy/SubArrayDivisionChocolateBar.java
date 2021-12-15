package com.company.easy;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivisionChocolateBar {

    // Problem link: https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {

        int result = 0;
        int sum = 0;

        for (int i=0; i<s.size(); i++) {

            for (int j=i; j<i+m && j<s.size(); j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) {
                result++;
            }
            sum = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        SubArrayDivisionChocolateBar.birthday(Arrays.asList(1, 3, 2, 2, 1), 5, 2);
    }

}
