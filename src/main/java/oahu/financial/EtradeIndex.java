package oahu.financial;

import java.util.Collection;

public interface EtradeIndex {
    StockPrice getSpot(String ticker);
    Collection<StockPrice> getSpots();
}
