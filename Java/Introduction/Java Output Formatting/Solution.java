// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-output-formatting

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final String line = "================================";

        System.out.println(line);

        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 3; ++i) {
                String stringValue = in.next();
                int intValue = in.nextInt();

                // Condition: String and is left justified using exactly  characters + Integer, expressed in exactly  digits
                System.out.printf("%-15s%03d%n", stringValue, intValue);
            }
        }

        System.out.println(line);
    }

}
