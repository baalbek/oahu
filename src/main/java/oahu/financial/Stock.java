package oahu.financial;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 6/4/13
 * Time: 10:50 PM
 */
public interface Stock {
    String getCompanyName();
    String getTicker();
    int getTickerCategory();
    int getOid();
    List<StockPrice> getPrices();
    List<Derivative> getDerivatives();
}
