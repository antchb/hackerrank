// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-if-else

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt(); // Condition: 1 <= n <= 100

            String result = (n % 2 != 0 || n >= 6 && n <= 20) ? "Weird" : "Not Weird";
            System.out.println(result);
        }
    }

}
