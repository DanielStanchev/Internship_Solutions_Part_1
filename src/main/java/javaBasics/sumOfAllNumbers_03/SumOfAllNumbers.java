package javaBasics.sumOfAllNumbers_03;

import java.util.Scanner;

public class SumOfAllNumbers {

    public static void main(String[] args) {


        //        Exercise 3: Write a program which prints the sum of all numbers from 1 to N (N is a
        //        parameter passed as runtime argument to the program). Write it in 3 different modes: using
        //        while, do-while & for loop.

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //for loop
        int sum1 = 0;

        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        System.out.println(sum1);


        //while loop
        int sum2 = 0;

        int j = 1;
        while (j <= n) {
            sum2 += j;
            j++;
        }
        System.out.println(sum2);


        //do-while
        int sum3 = 0;

        int k = 1;
        do {
            sum3 += k;
            k++;
        } while (k <= n);
        System.out.println(sum3);

    }
}
