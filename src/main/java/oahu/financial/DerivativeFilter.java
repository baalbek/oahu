package oahu.financial;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 1/17/13
 * Time: 12:05 AM
 */
public interface DerivativeFilter {
    void setFilter(Set<String> tickers);
    void addFilterTicker(String ticker);
}
