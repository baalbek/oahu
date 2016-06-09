package oahu.financial;

import java.time.LocalDate;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 6/4/13
 * Time: 10:50 PM
 */
public interface Derivative {
    public static int BUY = 1;
    public static int SELL = 2;

    public static int CALL = 1;
    public static int PUT = 2;
    public static int OPTYPE_UNDEF = 3;

    public enum OptionType { CALL, PUT, UNDEF };

    Stock getStock();
    int getOpType();
    String getOpTypeStr();
    double getX();
    String getTicker();
    int getOid();
    void setOid(int oid);
    LocalDate getExpiry();
    String getSeries();
}
