package ro.sit.homework.Homework2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year between 1900 and 2016: ");
        int year = scanner.nextInt();

        if (year >= 1900 && year <= 2016) {
            int daysInFebruary = calculateDaysInFebruary(year);
            System.out.println("Number of days in February for the year " + year + ": " + daysInFebruary);
        } else {
            System.out.println("Invalid year! Please enter a year between 1900 and 2016.");
        }

        scanner.close();
    }

    private static int calculateDaysInFebruary(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 29; // Leap year: February has 29 days
        } else {
            return 28; // Non-leap year: February has 28 days
        }
    }
}
