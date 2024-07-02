package javaCodingTasks;

public class BalancedBrackets {
    public static void main(String[] args) {

        String firstStingToCheck = "{[([{[]}])]}";
        String secondStringToCheck = "{{][{{]}]])";

        if (checkIfBracketsAreBalanced(firstStingToCheck)) {
            System.out.println("First String is balanced");
        } else {
            System.out.println("First String is not balanced");
        }

        if (checkIfBracketsAreBalanced(secondStringToCheck)) {
            System.out.println("Second String is balanced");
        } else {
            System.out.println("Second String is not balanced");
        }

    }

    private static boolean checkIfBracketsAreBalanced(String stringToCheck) {

        while (stringToCheck.contains("()") || stringToCheck.contains("{}") || stringToCheck.contains("[]")){

            stringToCheck = stringToCheck.replaceAll("\\[\\]","")
                .replaceAll("\\{\\}","")
                .replaceAll("\\(\\)","");
        }

        return stringToCheck.length()==0;
    }
}

