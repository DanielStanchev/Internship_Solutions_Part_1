package javaDataStructures.reverseLinkedList_06;

import java.util.List;

public class ReverseLinkedListServiceImpl implements ReverseLinkedListService {
    @Override
    public List<Integer> reverseLinkedList(List<Integer> listToReverse) {

        int left = 0;
        int right = listToReverse.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int currentNumber = listToReverse.get(left);
            listToReverse.set(left, listToReverse.get(right));
            listToReverse.set(right, currentNumber);

            // Move pointers towards the center
            left++;
            right--;
        }
        return listToReverse;
    }
}

