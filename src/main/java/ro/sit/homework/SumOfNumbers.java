package ro.sit.homework;

public class SumOfNumbers {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int number = 1;

        while (count < 100) {
            sum += number;
            number++;
            count++;
        }

        System.out.println("Sum of the first 100 numbers greater than 0: " + sum);
    }
}