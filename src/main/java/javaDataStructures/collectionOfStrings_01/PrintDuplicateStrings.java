package javaDataStructures.collectionOfStrings_01;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateStrings {

    public static void main(String[] args) {

//        Given a collection of Strings, find and print the duplicate Strings

        List<String> randomStrings = new ArrayList<>();
        randomStrings.add("Ivan");
        randomStrings.add("Georgi");
        randomStrings.add("Ivan");
        randomStrings.add("Daniel");
        randomStrings.add("Petkan");
        randomStrings.add("Petkan");

        final FindDuplicateStringsService find = new FindDuplicateStringsServiceImpl();
        List<String> duplicateStrings = find.findAndReturnDuplicateStrings(randomStrings);
        duplicateStrings.forEach(System.out::println);
    }
}
