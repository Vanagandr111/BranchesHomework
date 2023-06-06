import java.util.Arrays;

public class SalesManager {
  protected int[] sales;

  public SalesManager(int[] sales) {
    Arrays.sort(sales);
    this.sales = sales;
  }

  public int max() {
    int max = -1;
    for (int sale : sales) {
      if (sale > max) {
        max = sale;
      }
    }
    return max;
  }

  public int truncatedMean() {
    int mean = 0;

    if(sales.length == 0) {
      return -1;
    }

    for(int sale: sales) {
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