import org.junit.Test;
import ru.netology.StatisticsService;

import static org.junit.Assert.assertEquals;

public class StatisticsServiceTest {

    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    public void findMaxIfOtherIncome() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 13, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
