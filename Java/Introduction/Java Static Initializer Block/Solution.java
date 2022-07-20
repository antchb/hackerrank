// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-static-initializer-block

import java.util.Scanner;

public class Solution {

    private static int b, h;
    private static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);

        b = scan.nextInt();
        h = scan.nextInt();

        scan.close();

        flag = b > 0 && h > 0;

        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = b * h;
            System.out.print(area);
        }
	}

}
