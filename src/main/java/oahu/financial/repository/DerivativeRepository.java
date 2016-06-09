package oahu.financial.repository;

import oahu.financial.DerivativePrice;

import java.util.Optional;

/**
 * Created by rcs on 20.10.14.
 *
 */
public interface DerivativeRepository<T> {
    Optional<DerivativePrice> findDerivativePrice(T optionInfo);
    void invalidate(String ticker);
    void invalidateAll();
}
