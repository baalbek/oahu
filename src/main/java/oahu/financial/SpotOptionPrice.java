package oahu.financial;

import java.time.LocalDate;

/**
 * Created by rcs on 23.08.15.
 */
public interface SpotOptionPrice {
    int getOpxId();
    String getOpxName();
    LocalDate getPurchaseDate();
    int getDays();
    double getSpot();
    double getBuy();
    double getSell();
}

