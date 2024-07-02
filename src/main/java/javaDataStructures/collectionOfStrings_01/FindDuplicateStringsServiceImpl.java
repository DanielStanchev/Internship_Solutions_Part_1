package javaDataStructures.collectionOfStrings_01;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateStringsServiceImpl implements FindDuplicateStringsService {

    @Override
    public List<String> findAndReturnDuplicateStrings(List<String> strings) {

        List<String> duplicateStrings = new ArrayList<>();

        for (int i = 0; i <strings.size(); i++) {
            String currentString = strings.get(i);
            for (int j = i+1; j <strings.size() ; j++) {
                String nextElement = strings.get(j);
                if(currentString.equals(nextElement)){
                    duplicateStrings.add(nextElement);
                    break;
                }
            }
        }
        return duplicateStrings;
    }
}
