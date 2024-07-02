package javaCodingTasks;

public class CheckIfNumberIsPrime {
    public static void main(String[] args) {

        int number = 17;

        boolean isPrime = checkIfIsAPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }


    private static boolean checkIfIsAPrimeNumber(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
