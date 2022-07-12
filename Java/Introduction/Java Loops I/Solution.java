// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-loops-i

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt(); // Condition: 2 <= n <= 20

            for (int i = 1; i <= 10; ++i) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
        } 
    }

}
