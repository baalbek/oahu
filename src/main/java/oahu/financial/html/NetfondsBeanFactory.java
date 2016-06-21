package oahu.financial.html;

import java.time.LocalDate;

/**
 * Created by rcs on 21.06.16.
 *
 */
public interface NetfondsBeanFactory {
    /*
    private String optionName;
    private String optionType;
    private String xPrice;
    private String expiry;
    private String buy;
    private String sell;
    */
    void onDerivativeParsed(String optionName,
                            String optionType,
                            double exercisePrice,
                            LocalDate expiry,
                            double buy,
                            double sell);
}
