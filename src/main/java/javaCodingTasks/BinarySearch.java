package javaCodingTasks;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {13, 2, 34, 73, 24, 86};
        Arrays.sort(arr);

        System.out.println(indexOf(arr, 73));
    }

    private static int indexOf(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int currentMid = arr[mid];

            if (key < currentMid) {
                end = mid - 1;
            } else if (key > currentMid) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
