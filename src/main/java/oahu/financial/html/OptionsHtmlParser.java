package oahu.financial.html;

import oahu.financial.StockPrice;

/**
 * Created by rcs on 7/17/14.
 *
 */
public interface OptionsHtmlParser<T> {
    StockPrice parseSpot(T page);
}
