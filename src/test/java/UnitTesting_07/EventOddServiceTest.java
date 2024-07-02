package UnitTesting_07;

import org.junit.Assert;
import org.junit.Test;


public class EventOddServiceTest {

    @Test
    public void checkIfNumberIsOdd() {
        int n1 = 1;
        Assert.assertEquals("Number 1 is odd.", checkEvenOrOdd(n1));
    }

    private String checkEvenOrOdd(int n) {
        String feedback;
        if (n % 2 == 0) {
            return feedback = "Number " + n + " is even.";
        } else {
            return feedback = "Number " + n + " is odd.";
        }
    }

}