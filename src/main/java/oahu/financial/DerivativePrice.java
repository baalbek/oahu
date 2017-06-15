package oahu.financial;


import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 6/4/13
 * Time: 10:50 PM
 */
public interface DerivativePrice {
    Derivative getDerivative();
    StockPrice getStockPrice();
    double getDays();
    Optional<Double> getIvBuy();
    Optional<Double> getIvSell();
    double getBuy();
    double getSell();
    Optional<Double> getBreakEven();
    Optional<Double> stockPriceFor(double optionValue);
    double optionPriceFor(double stockPrice);
    int getOid();
    void setOid(int oid);
    String getTicker();
    public double getCurrentRiscOptionValue();
    public Optional<Double> getCurrentRisc();
}
