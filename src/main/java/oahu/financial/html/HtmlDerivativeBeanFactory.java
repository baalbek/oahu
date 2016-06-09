package oahu.financial.html;

import oahu.financial.Derivative;
import oahu.financial.OptionCalculator;
import oahu.financial.StockPrice;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 1/6/13
 * Time: 10:44 PM
 */
public interface HtmlDerivativeBeanFactory<T> {
    Derivative createDerivative(List<T> cells,
                                    StockPrice parent,
                                    OptionCalculator calculator);
}
