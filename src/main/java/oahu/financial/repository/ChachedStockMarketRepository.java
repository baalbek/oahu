package oahu.financial.repository;

import oahu.financial.Derivative;

import java.util.Optional;

/**
 * Created by rcs on 29.07.17.
 */
public interface ChachedStockMarketRepository {
    Optional<Derivative> findDerivative(String derivativeTicker);
    void invalidateCache();
}
