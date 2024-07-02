package interview;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] numbersToSort = {5, 12, 20, 1};

        print(numbersToSort);
        System.out.println();
        print(sortNumbers(numbersToSort));

    }


    private static int[] sortNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    private static void print(int[] array) {
        for (int c : array) {
            System.out.print(c + " ");
        }
    }

}
