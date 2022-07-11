// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-stdin-stdout

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Integer intValue = Integer.parseInt(in.nextLine());
            Double doubleValue = Double.parseDouble(in.nextLine());
            String stringValue = in.nextLine();

            System.out.println("String: " + stringValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Int: " + intValue);
        }
    }

}
