package interview;

import java.util.Arrays;

public class ReverseStringSample {
    public static void main(String[] args) {

        String word = "pencil";

        String reversed = reverseString(word);

        System.out.println(reversed);
    }

    private static String reverseString(String word) {

        int start = 0;
        int end = word.length() - 1;
        char [] symbols = word.toCharArray();

        while (start < end) {

            char temp = symbols[start];
            symbols[start] = symbols[end];
            symbols[end] = temp;

                start++;
                end--;
        }

        return new String(symbols);

    }


}
