package javaCodingTasks;

public class CalculateFactorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.print("Factorial of " + number + " is:");
        System.out.print(factorial);
    }

    private static long calculateFactorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
