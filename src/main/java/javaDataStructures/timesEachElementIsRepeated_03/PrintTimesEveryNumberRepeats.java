package javaDataStructures.timesEachElementIsRepeated_03;

import java.util.ArrayList;
import java.util.List;

public class PrintTimesEveryNumberRepeats {
    public static void main(String[] args) {

//        Given a collection of Integers, print out how many times each element is
//        repeated. NOTE: preserve the order of appearance in the given collection

        List<Integer> numbers =  new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);

        final RepeatedElementsService numbersByRepeating = new RepeatedElementsServiceImpl();
        numbersByRepeating.printTimesNumberRepeated(numbers).forEach((k,v)->System.out.printf("Number %d repeated %d times %n",k,v));
    }
}
