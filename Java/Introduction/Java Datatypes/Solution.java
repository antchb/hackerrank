// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-datatypes

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; ++i) {
            try {
                long value = in.nextLong();

                System.out.println(value + " can be fitted in:");

                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }

        in.close();
    }

}
