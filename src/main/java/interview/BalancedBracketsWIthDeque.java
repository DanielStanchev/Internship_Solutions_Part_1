package interview;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedBracketsWIthDeque {
    public static void main(String[] args) {

        String firstString = "{[([[()]])]}";
        String secondString = "{[(()]]}";

        boolean areBalanced = checkIfBalanced(secondString);

        if (areBalanced) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    private static boolean checkIfBalanced(String brackets) {

        Deque<Character> deque = new LinkedList<>();
        char[] symbols = brackets.toCharArray();

        for (char symbol : symbols) {

            if (symbol == '{' || symbol == '(' || symbol == '[') {
                deque.addFirst(symbol);

            } else {

                if ((deque.peekFirst() == '(' && symbol == ')') || (deque.peekFirst() == '[' && symbol == ']') || (deque.peekFirst() == '{'
                    && symbol == '}')){
                    deque.removeFirst();
                } else {
                    return false;
                }

            }
        }

        return deque.isEmpty();

    }
}
