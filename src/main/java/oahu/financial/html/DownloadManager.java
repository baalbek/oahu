package oahu.financial.html;

import java.io.File;
import java.io.IOException;

/**
 * Created by rcs on 16.07.2014.
 *
 */
public interface DownloadManager<T> {
    T getLastDownloadedHtmlPage(String ticker) throws IOException;
    File getLastDownloadedFile(String ticker) throws IOException;
}
