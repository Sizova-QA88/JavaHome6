package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testSalesAll() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.salesAll(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumSalesMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.monthSalesMax(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMinimumSalesMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.monthSalesMin(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.salesBelowAverageMonths(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testSalesAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.salesAboveAverageMonths(sales);

        Assertions.assertEquals(expected, actual);

    }

}