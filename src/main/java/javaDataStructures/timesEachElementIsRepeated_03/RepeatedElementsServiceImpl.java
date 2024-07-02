package javaDataStructures.timesEachElementIsRepeated_03;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepeatedElementsServiceImpl implements RepeatedElementsService {
    @Override
    public Map<Integer, Integer> printTimesNumberRepeated(List<Integer> numbers) {

        Map<Integer, Integer> repeatedNumbers = new LinkedHashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int repeating = 1;
            if (repeatedNumbers.containsKey(currentNumber)) {
                continue;
            }
            for (int j = i + 1; j < numbers.size(); j++) {
                int nextNumber = numbers.get(j);
                if (currentNumber == nextNumber) {
                    repeating++;
                    repeatedNumbers.get(currentNumber);
                }
            }
            repeatedNumbers.put(currentNumber, repeating);
        }
        return repeatedNumbers;
    }
}
