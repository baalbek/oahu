package oahu.financial.repository;

import oahu.financial.Derivative;
import oahu.financial.DerivativePrice;
import oahu.financial.StockPrice;

import java.io.File;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

/**
 * Created by rcs on 20.10.14.
 *
 */
public interface EtradeRepository<T,T2> {
    public static enum PersistentCategory { OPTION_REF, OPTION_PRICE, STOCK_PRICE, ALL};
    Optional<DerivativePrice> findDerivativePrice(T optionInfo);
    Optional<StockPrice> stockPrice(String ticker);
    Optional<StockPrice> stockPrice(String ticker, File suppliedFile);
    Collection<DerivativePrice> puts(String ticker);
    Collection<DerivativePrice> puts(String ticker, File suppliedFile);
    Collection<DerivativePrice> calls(String ticker);
    Collection<DerivativePrice> calls(String ticker, File suppliedFile);
    Collection<Derivative> callPutDefs(String ticker);
    Collection<Derivative> callPutDefs(String ticker, File suppliedFile);
    void saveToPersistentDataStore(PersistentCategory category);
    void saveToPersistentDataStore(String ticker, File suppliedFile, PersistentCategory category);
    void setDownloadDate(LocalDate localDate);
}
