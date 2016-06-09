package oahu.financial.html;

import oahu.dto.Tuple;
import oahu.financial.Derivative;
import oahu.financial.Stock;
import oahu.financial.StockPrice;

import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 1/2/13
 * Time: 11:28 PM
 */
public interface EtradeHtmlParser<T> {
    Collection<Derivative> parseDerivatives(T page);
    Collection<Derivative> parseDerivatives(T page, Stock parent);
    Tuple<Collection<Derivative>> parseDerivativesTuple(T page);
    Tuple<Collection<Derivative>> parseDerivativesTuple(T page, StockPrice parent);
    StockPrice parseSpot(T page, String ticker);
    Map<String,StockPrice> parseSpots(T page);
}
