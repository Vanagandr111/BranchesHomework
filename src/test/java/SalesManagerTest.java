import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesManagerTest {
    @Test
    public void test1() {
        final long[] sales = new long[] {9, 32, 123, 51, 132, 13221};
        final SalesManager manager = new SalesManager(sales);
        final long expected = 13221;

        final long result = manager.max();
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        final long[] emptySales = new long[] {};
        final SalesManager manager = new SalesManager(emptySales);
        final long expected = -1;

        final long result = manager.max();
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        final long[] sales = new long[] {9, 32, 123, 51, 132, 13221};
        final SalesManager manager = new SalesManager(sales);
        final long expected = (32 + 51 + 123 + 132) / 4;

        final long result = manager.truncatedMean();

        assertEquals(expected, result);
    }
}
