package oahu.financial.repository;

import oahu.financial.DerivativePrice;
import oahu.financial.StockPrice;

import java.util.Optional;

/**
 * Created by rcs on 29.07.17.
 *
 */
public interface ChachedEtradeRepository<T> {
    Optional<DerivativePrice> findDerivativePrice(T optionInfo);
    Optional<StockPrice> findSpot(String ticker);
    void invalidateCache();
}
