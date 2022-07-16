// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-end-of-file

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            for (int lineNumber = 1; in.hasNext(); ++lineNumber) {
                System.out.println(lineNumber + " " + in.nextLine());
            }
        }
    } 

}
