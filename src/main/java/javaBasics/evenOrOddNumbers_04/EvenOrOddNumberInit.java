package javaBasics.evenOrOddNumbers_04;

import java.util.Scanner;

public class EvenOrOddNumberInit {
    public static void main(String[] args) {
        //Write a program to check if a number is even or odd. The number must be a
        //parameter and passed as runtime argument. Implement this in a separate class called
        //EventOddService using singleton pattern.

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        EventOddService.checkIfNumberIsOdd(n);
    }
}
