import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Main {

  public static void main(String[] args) {
    long[] salesInCurrentMonth = new long[0];
    long[] salesInLastMonth = new long[30];
    Random random = new Random();
    Logger logger = Logger.getLogger("Sales Manager Homework");

    for(int n = 0; n < salesInLastMonth.length; n++) {
      salesInLastMonth[n] = random.nextLong(1000);
    }
    SalesManager managerCurrentMonth = new SalesManager(salesInCurrentMonth);
    SalesManager managerLastMonth = new SalesManager(salesInLastMonth);

    logger.info("Продажи в данном месяце: " + Arrays.toString(salesInCurrentMonth));
    logger.info("Максимальная цена продажи в данном месяце была: " + managerCurrentMonth.max());
    logger.info("Обрезанное среднее продаж в данном месяце: " + managerCurrentMonth.truncatedMean());

    logger.info("Продажи в последнем месяце: " + Arrays.toString(salesInLastMonth));
    logger.info("Максимальная цена продажи в последнем месяце была: " + managerLastMonth.max());
    logger.info("Обрезанное среднее продаж в последнем месяце: " + managerLastMonth.truncatedMean());
  }
}