package javaDataStructures.findPositionOfInteger_04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PositionOfIntegerServiceImpl implements PositionOfIntegerService {

    @Override
    public Map<Integer, Integer> returnIntegerPositionInArrayList(List<Integer> numbers, Integer particularNumber) {

        Map<Integer, Integer> integerPositionMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            if (particularNumber == currentNumber) {
                integerPositionMap.put(currentNumber, i);
            }
        }
        return integerPositionMap;
    }
}
