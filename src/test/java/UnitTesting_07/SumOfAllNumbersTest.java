package UnitTesting_07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfAllNumbersTest {

    @Test
    public void main() {
        int n1 = 5;
        int expectedSum1 = 15;
        int actualSum1 = calculateSum(n1);
        assertEquals(expectedSum1, actualSum1);
    }

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
