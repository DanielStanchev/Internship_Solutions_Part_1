package interview;


public class ReverseString {
    public static void main(String[] args) {

        String word = "pencil";

        System.out.println(word);

        System.out.println(reverse(word));

    }

    private static String reverse(String word) {

        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        return new String(arr);

    }

}
