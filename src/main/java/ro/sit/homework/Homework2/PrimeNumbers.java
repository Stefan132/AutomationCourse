package ro.sit.homework.Homework2;
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers lower than 1,000,000:");
        for (int i = 2; i < 1_000_000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

