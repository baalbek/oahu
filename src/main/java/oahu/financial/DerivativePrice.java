package oahu.financial;


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
    double getIvBuy();
    double getIvSell();
    double getBuy();
    double getSell();
    double getBreakEven();
    double calcRisc(double value);
    int getOid();
    void setOid(int oid);
    String getTicker();
}
