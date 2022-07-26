// HackerRank [https://www.hackerrank.com]

// Link to the problem:
// https://www.hackerrank.com/challenges/java-date-and-time

import java.util.Scanner;
import java.time.LocalDate;

public class Solution {
    
    public static String getDayName(String day, String month, String year) {
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

        return date.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String month = in.next();
            String day = in.next();
            String year = in.next();

            System.out.println(getDayName(day, month, year));
        }
    }
}
