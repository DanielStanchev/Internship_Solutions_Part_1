package javaCodingTasks;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms");

        int numberOfTerms = Integer.parseInt(scanner.nextLine());

        System.out.println("Fibonacci sequence up to "+ numberOfTerms +" terms");

        int firstTerm = 0;
        int secondTerm = 1;

        if(numberOfTerms>=1){
            System.out.println(firstTerm+" ");
        }

        if(numberOfTerms>=2){
            System.out.println(secondTerm+" ");
        }

        for (int i = 3; i <=numberOfTerms; i++) {
            int nextTerm = firstTerm+secondTerm;
            System.out.println(nextTerm+" ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
            
        }

    }

