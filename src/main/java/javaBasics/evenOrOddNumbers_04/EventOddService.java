package javaBasics.evenOrOddNumbers_04;

public class EventOddService {

    private EventOddService() {
        throw new IllegalStateException("Util class cannot be instantiated.");
    }

    public static void checkIfNumberIsOdd(Integer number) {
        if (number % 2 == 0) {
            System.out.printf("Number %d is even.%n", number);
        } else {
            System.out.printf("Number %d is odd.%n", number);
        }
    }

}
