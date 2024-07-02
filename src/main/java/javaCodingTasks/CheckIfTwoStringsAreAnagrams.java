package javaCodingTasks;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringsAreAnagrams {
    public static void main(String[] args) {

        //проверяваме дали всички символи от едната дума се съдържат в другата

        String firstString = "listen";
        String secondString = "silent";

        boolean areAnagrams = checkIfTwoStringsAreAnagrams(firstString, secondString);

        if (areAnagrams) {
            System.out.println(firstString + " and " + secondString + " are anagrams");
        } else {
            System.out.println(firstString + " and " + secondString + " are NOT anagrams");
        }
    }


    private static boolean checkIfTwoStringsAreAnagrams (String firstString, String secondString){

        if(firstString.length() != secondString.length()){
            return false;
        }

        Map<Character, Integer> occurences = new HashMap<>();

        for (char c: firstString.toCharArray()) {
            if(!occurences.containsKey(c)){
                occurences.put(c,1);
            } else {
                occurences.put(c, occurences.get(c)+1);
            }
        }

        for (char c:secondString.toCharArray()) {
            occurences.remove(c);
        }

        if(occurences.isEmpty()){
            return true;
        }

        return false;
    }
}
