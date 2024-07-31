package ru.netology.stats;

public class StatsService {
    public long salesAll(long[] sales) {
        long salesAll = 0;
        for (long sale : sales) {
            salesAll += sale;
        }
        return salesAll;
    }


    public long averageSales(long[] sales) {
        long salesAll = 0;
        for (long sale : sales) {
            salesAll += sale;
        }
        long averageSales = salesAll / 12;
        return averageSales;
    }

    public int monthSalesMax(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;

    }

    public int monthSalesMin(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int salesBelowAverageMonths(long[] sales) {
        long averageSales = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int salesAboveAverageMonths(long[] sales) {
        long averageSales = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
