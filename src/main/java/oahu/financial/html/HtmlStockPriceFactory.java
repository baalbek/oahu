package oahu.financial.html;

import oahu.financial.StockPrice;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/4/13
 * Time: 1:47 PM
 */
public interface HtmlStockPriceFactory<T> {
    static short HTML_TYPE_OPTIONS = 1;
    static short HTML_TYPE_OBX = 2;

    StockPrice createStockPrice(T row, int htmlType, String ticker);
}
