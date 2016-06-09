package oahu.financial.repository;

import java.io.File;
import java.util.Collection;
import oahu.dto.Tuple;
import oahu.dto.Tuple3;
import oahu.financial.Derivative;
import oahu.financial.DerivativePrice;
import oahu.financial.StockPrice;

public interface EtradeDerivatives {
    StockPrice getSpot(String ticker);
    StockPrice getSpot2(File file);
    StockPrice getSpot2(File file, String ticker);
    Collection<DerivativePrice> getCalls(String ticker);
    Collection<DerivativePrice> getPuts(String ticker);
    Tuple<Collection<DerivativePrice>> getCallsPuts(String ticker);
    Tuple3<StockPrice,Collection<DerivativePrice>,Collection<DerivativePrice>> getSpotCallsPuts(String ticker);
    Tuple3<StockPrice,Collection<DerivativePrice>,Collection<DerivativePrice>> getSpotCallsPuts2(File file);
    Collection<Derivative> getCallPutDefs(String ticker);
    Collection<Derivative> getCallPutDefs2(File file);
}
