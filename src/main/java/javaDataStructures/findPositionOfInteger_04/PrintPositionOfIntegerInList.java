package javaDataStructures.findPositionOfInteger_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintPositionOfIntegerInList {
    public static void main(String[] args) {

        //        Given a sorted ArrayList of Integers, write a method that finds a particular integer
        //        and returns its position in the ArrayList, or -1 if the Integer is not in the ArrayList.

        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int numberToSearchFor = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(16);
        numbers.add(93);
        numbers.add(78);
        numbers.add(23);
        Collections.sort(numbers);

        final PositionOfIntegerService positions = new PositionOfIntegerServiceImpl();
        Map<Integer, Integer> toPrint = positions.returnIntegerPositionInArrayList(numbers, numberToSearchFor);

        if (toPrint.isEmpty()) {
            System.out.println(-1);
        } else {
            toPrint.forEach((k, v) -> System.out.printf("Element %d is in position %d", k, v));
        }

    }
}
