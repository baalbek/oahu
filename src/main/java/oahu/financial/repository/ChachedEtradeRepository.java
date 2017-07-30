package oahu.financial.repository;

import oahu.financial.DerivativePrice;

import java.util.Optional;

/**
 * Created by rcs on 29.07.17.
 *
 */
public interface ChachedEtradeRepository<T> {
    Optional<DerivativePrice> findDerivativePrice(T optionInfo);
    void invalidateCache();
}
