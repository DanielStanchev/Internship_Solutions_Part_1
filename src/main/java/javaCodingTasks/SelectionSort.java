package javaCodingTasks;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {14, 2, 10, 71, 86, 3};

        selectionSort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
}
