package oahu.financial.repository;

import oahu.financial.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by rcs on 04.08.14.
 */
public interface StockMarketRepository {
    /*
    Optional<DerivativePrice> findCallPrice(String ticker, String derivativeTicker);
    Optional<DerivativePrice> findPutPrice(String ticker, String derivativeTicker);

    Optional<StockPrice> getSpot(String stockTicker);

    Collection<DerivativePrice> getCallPrices(String ticker);
    Collection<DerivativePrice> getPutPrices(String ticker);
    */
    void insertDerivative(Derivative derivative);
    Optional<Derivative> findDerivative(String derivativeTicker);
    Stock findStock(String ticker);

    Collection<Stock> getStocks();

    Collection<StockPrice> findStockPrices(String ticker, LocalDate fromDx);

    void registerOptionPurchase(DerivativePrice purchase, int purchaseType, int volume);

    Collection<SpotOptionPrice> findOptionPrices(int opxId);
    Collection<SpotOptionPrice> findOptionPricesStockId(int stockId, LocalDate fromDate, LocalDate toDate);
    Collection<SpotOptionPrice> findOptionPricesStockIds(List<Integer> stockIds, LocalDate fromDate, LocalDate toDate);
    Collection<SpotOptionPrice> findOptionPricesStockTix(List<String> stockTix, LocalDate fromDate, LocalDate toDate);
    //void emptyCache();
}
