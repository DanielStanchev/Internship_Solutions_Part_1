package javaCodingTasks;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {

        List<Integer> listToSort = new ArrayList<>();
        listToSort.add(13);
        listToSort.add(9);
        listToSort.add(4);
        listToSort.add(15);
        listToSort.add(1);

        System.out.println("List prior sorting:"+listToSort);

        sortList(listToSort);

        System.out.println("List after sorting:"+listToSort);


    }

    private static List<Integer> sortList(List<Integer> listToSort){

        for (int i = 0; i <listToSort.size()-1 ; i++) {
            for (int j = 0; j <listToSort.size()-i-1; j++) {

                if(listToSort.get(j) > listToSort.get(j+1)){
                    int currentIter = listToSort.get(j);

                    listToSort.set(j,listToSort.get(j+1));
                    listToSort.set(j+1,currentIter);

                }
            }
        }

        return listToSort;

    }
}
