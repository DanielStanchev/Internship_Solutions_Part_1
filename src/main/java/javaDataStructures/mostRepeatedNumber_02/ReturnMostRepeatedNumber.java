package javaDataStructures.mostRepeatedNumber_02;

import java.util.ArrayList;
import java.util.List;

public class ReturnMostRepeatedNumber {
    public static void main(String[] args) {

//        Given a collection of Integers, find the number that is most repeated

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);

        final MostRepeatedNumberService number = new MostRepeatedNumberServiceImpl();
        System.out.println(number.findMostRepeatedNumber(numbers));

    }
}
