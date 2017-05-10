package oahu.financial;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 6/9/13
 * Time: 6:44 PM
 */
public interface StockPrice {
    double getValue();
    double getOpn();
    double getHi();
    double getLo();
    double getCls();
    double getMarketValue();
    int getVolume();
    Stock getStock();
    LocalDate getLocalDx();
    LocalTime getTm();
    int getOid();
    void assign(StockPrice other);
    List<DerivativePrice> getOptionPrices();
}
