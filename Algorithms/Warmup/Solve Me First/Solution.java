// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/solve-me-first/problem

import java.util.Scanner;

public class Solution {

    private static int solveMeFirst(final int a, final int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Condition: 1 <= a, b <= 1000
        int a, b;

        try (Scanner in = new Scanner(System.in)) {
            a = in.nextInt();
            b = in.nextInt();
        }

        System.out.println(solveMeFirst(a, b));
    }
}
