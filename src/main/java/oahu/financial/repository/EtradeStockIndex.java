package oahu.financial.repository;

import java.util.Collection;
import oahu.financial.StockPrice;

public interface EtradeStockIndex {
    Collection<StockPrice> getSpots();
}
