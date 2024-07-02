package interview;

public class BalancedBracketsWithStringReplace {
    public static void main(String[] args) {

        String firstString = "{[([[()]])]}";
        String secondString = "{[(()]]}";

        boolean areBalanced = checkIfBalanced(firstString);

        if(areBalanced){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    private static boolean checkIfBalanced(String brackets){

        if(brackets.isEmpty() || brackets.length()%2!=0){
            return false;
        }

        while (brackets.contains("()") || brackets.contains("[]") || brackets.contains("{}")){

            brackets = brackets.replaceAll("\\[\\]", "")
                .replaceAll("\\(\\)","")
                .replaceAll("\\{\\}","");

        }
        return brackets.length()==0;
    }


}
