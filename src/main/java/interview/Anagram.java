package interview;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("fired", "fried"));
    }

    private static boolean isAnagram(String left, String right) {

        char[] leftSymbols = left.toCharArray();
        char[] rightSymbols = right.toCharArray();

        sort(leftSymbols);
        //System.out.println(leftSymbols);

        sort(rightSymbols);

        if (Arrays.equals(leftSymbols, rightSymbols)) {
            return true;
        }

        return false;

    }

    private static void sort(char[] leftSymbols) {
        boolean swapped;

        for (int i = 0; i < leftSymbols.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < leftSymbols.length - 1 - i; j++) {

                if (leftSymbols[j] > leftSymbols[j + 1]) {
                    char temp = leftSymbols[j];
                    leftSymbols[j] = leftSymbols[j + 1];
                    leftSymbols[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }


}

