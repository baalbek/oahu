package oahu.financial.janitors;

import java.util.List;
import java.time.LocalDate;

/**
 * Created by rcs on 6/22/14.
 */
public interface JanitorContext {
    boolean isPaperHistory();

    boolean isFeed();

    String getOpen();
    String getClose();

    boolean isSpot();


    //---------------------------------------------------
    //----------------- Iv Harvest ----------------------
    //---------------------------------------------------
    boolean isIvHarvest();
    boolean isListHarvestFiles();
    boolean isOptionPriceHarvest();
    boolean isRedoOptionPriceHarvest();
    LocalDate harvestFrom();
    LocalDate harvestTo();
    //---------------------------------------------------

    boolean isQuery();

    List<String> getTickers();

    String getXml();

    boolean isUpdateDbOptions();
    boolean isRollingOptions();
    int getRollingInterval();
    boolean isOneTimeDownloadOptions();
    boolean isSpotFromDownloadedOptions();
    boolean isTestRun();
}

