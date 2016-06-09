package oahu.financial;


import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 1/16/13
 * Time: 10:41 PM
 */
public interface CritterEtrade {
    void invalidate();
    Stock getSpot();
    Map<String,Derivative> getDerivativesMap();
}
