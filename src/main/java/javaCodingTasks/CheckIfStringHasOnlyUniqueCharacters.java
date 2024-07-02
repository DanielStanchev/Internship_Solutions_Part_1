package javaCodingTasks;

import java.util.HashSet;
import java.util.Set;

public class CheckIfStringHasOnlyUniqueCharacters {
    public static void main(String[] args) {

        String firstString = "abcdefg";
        String secondString = "hello";

        System.out.println("Is it true that String has only unique Characters- " + checkIfStringHasOnlyUniqueCharacters(firstString));
        System.out.println("Is it true that String has only unique Characters- " + checkIfStringHasOnlyUniqueCharacters(secondString));

    }

    private static boolean checkIfStringHasOnlyUniqueCharacters(String word) {

        char[] stringCharacters = word.toCharArray();
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < stringCharacters.length; i++) {
            characterSet.add(stringCharacters[i]);
        }

        if (stringCharacters.length == characterSet.size()) {
            return true;
        }
        return false;
    }
}
