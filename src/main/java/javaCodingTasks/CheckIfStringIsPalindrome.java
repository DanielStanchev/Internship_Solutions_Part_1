package javaCodingTasks;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {

        String word = "radar";

        boolean isPalindrome = checkIfStringIsPalindrome(word);

        if (isPalindrome) {
            System.out.println(word + " is Palindrome.");
        } else {
            System.out.println(word + " is not Palindrome.");
        }

    }

    private static boolean checkIfStringIsPalindrome(String string) {

        int start = 0;
        int end = string.length() - 1;

        while (start < end) {

            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


}
