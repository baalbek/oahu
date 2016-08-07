package oahu.financial.repository;

import oahu.financial.Derivative;
import oahu.financial.DerivativePrice;
import oahu.financial.StockPrice;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by rcs on 20.10.14.
 *
 */
public interface EtradeRepository<T> {
    Optional<DerivativePrice> findDerivativePrice(T optionInfo);
    Optional<StockPrice> stockPrice(String ticker);
    Collection<DerivativePrice> puts(String ticker);
    Collection<DerivativePrice> calls(String ticker);
    Collection<Derivative> callPutDefs(String ticker);
    void invalidate(String ticker);
    void invalidateAll();
}