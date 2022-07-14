// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-loops

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // (a + 2^0 * b), (a + 2^0 * b + 2^1 * b) ... (a + 2^0 * b + 2^1 * b ... 2^(n-1) * b)
        try (Scanner in = new Scanner(System.in)) {
            // Condition: 0 <= q <= 500
            int q = in.nextInt();
            for (int i = 0; i < q; ++i) {
                // Conditions: 0 <= a, b <= 50; 1 <= n <= 15
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                for (int j = 0; j < n; ++j) {
                    a = a + (int) Math.pow(2, j) * b;
                    System.out.print(a + " ");
                }

                System.out.println();
            }
        } 
    }

}
