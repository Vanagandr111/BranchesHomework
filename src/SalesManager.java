import java.util.Arrays;

public class SalesManager {
  protected long[] sales;

  public SalesManager(long[] sales) {
    Arrays.sort(sales);
    this.sales = sales;
  }

  public long max() {
    long max = -1;
    for (long sale : sales) {
      if (sale > max) {
        max = sale;
      }
    }
    return max;
  }

  public long truncatedMean() {
    long mean = 0;

    if(sales.length == 0) {
      return -1;
    }

    for(long sale: sales) {
      mean += sale;
    }

    if(sales.length > 3) {
      mean -= sales[0];
      mean -= sales[sales.length-1];

      mean /= sales.length - 2;
    } else {
      mean /= sales.length;
    }

    return mean;
  }
}