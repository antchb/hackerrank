// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-strings-introduction

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        scan.close();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(capitalizeFirstLetter(a) + " " + capitalizeFirstLetter(b));
    }

    private static String capitalizeFirstLetter(String str) {
        String changedString;

        if (str == null || str.isEmpty()) {
            changedString = "";
        } else {
            changedString = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }

        return changedString;
    }

}
