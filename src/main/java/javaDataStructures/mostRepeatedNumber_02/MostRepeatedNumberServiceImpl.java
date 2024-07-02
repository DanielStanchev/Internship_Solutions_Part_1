package javaDataStructures.mostRepeatedNumber_02;

import java.util.List;

public class MostRepeatedNumberServiceImpl implements MostRepeatedNumberService {

    @Override
    public Integer findMostRepeatedNumber(List<Integer> numbers) {
        int mostRepeatedNumber=0;
        int totalRepeatings = 0;
        int currentNumberRepeatings = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                int nextNumber = numbers.get(j);
                if (currentNumber == nextNumber) {
                    currentNumberRepeatings++;
                }
            }
            if (currentNumberRepeatings > totalRepeatings) {
                currentNumberRepeatings = totalRepeatings;
                mostRepeatedNumber = currentNumber;
            }
        }

        return mostRepeatedNumber;
    }
}
