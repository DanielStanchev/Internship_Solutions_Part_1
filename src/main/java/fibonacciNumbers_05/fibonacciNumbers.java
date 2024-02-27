package fibonacciNumbers_05;

import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {

        //Write a program that prints Fibonacci numbers - both recursive & non-recursive
        //versions. The program should accept how many numbers to print as runtime argument.

        Scanner scanner = new Scanner(System.in);

        int totalNumbers = Integer.parseInt(scanner.nextLine());

        //non-recursive
        int previousNumber = 0;
        int currentNumber = 1;
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println(currentNumber);
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        System.out.println();

        //recursive
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
