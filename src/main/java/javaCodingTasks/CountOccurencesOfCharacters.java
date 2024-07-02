package javaCodingTasks;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfCharacters {
    public static void main(String[] args) {

        String sentence = "Hello wold";

        Map<Character, Integer> charactersInSentence = countCharacters(sentence);

        print(charactersInSentence);

    }

    private static void print(Map<Character, Integer> charactersInSentence) {

        for (Map.Entry<Character, Integer> entry : charactersInSentence.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private static Map<Character, Integer> countCharacters(String sentence) {

        Map<Character, Integer> charactersCounter = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            if (!charactersCounter.containsKey(c)) {
                charactersCounter.put(c, 1);
            } else {
                charactersCounter.put(c, charactersCounter.get(c) + 1);
            }
        }
        return charactersCounter;
    }

}
