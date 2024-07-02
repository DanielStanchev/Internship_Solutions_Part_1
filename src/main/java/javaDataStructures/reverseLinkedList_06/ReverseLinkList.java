package javaDataStructures.reverseLinkedList_06;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkList {
    public static void main(String[] args) {

        //Reverse a LinkedList

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);


        final ReverseLinkedListService rev = new ReverseLinkedListServiceImpl();
        rev.reverseLinkedList(numbers)
            .forEach(System.out::println);
    }
}
