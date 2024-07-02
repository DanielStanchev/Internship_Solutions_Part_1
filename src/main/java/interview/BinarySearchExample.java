package interview;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

    int [] numbers = {1,4,5,6,8};
        Arrays.sort(numbers);
        Integer index = 3;

        Integer number = searchBinaryNumber(numbers,index);
        System.out.println(number);

    }

    private static Integer searchBinaryNumber(int [] numbers, Integer index){

        int start = 0;
        int end = numbers.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            int currentMid = mid;

            if(index>currentMid){
                start = mid+1;
            }else if(index<currentMid){
                end = mid-1;
            } else {
                return numbers[mid];
            }
        }
        return null;
    }


}
