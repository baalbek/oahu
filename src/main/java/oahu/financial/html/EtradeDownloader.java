/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oahu.financial.html;

import oahu.dto.Tuple;

import java.io.IOException;
import java.util.Optional;

/**
 *
 * @author rcs
 */
public interface EtradeDownloader<WebClientType,HtmlPageType> {
    HtmlPageType downloadDerivatives(String ticker) throws IOException;
    HtmlPageType downloadIndex(String stockIndex) throws IOException;
    HtmlPageType downloadPaperHistory(String ticker) throws IOException;

    HtmlPageType downloadDepth(String ticker) throws  IOException;
    HtmlPageType downloadPurchases(String ticker) throws  IOException;
    void login() throws IOException;
    void logout() throws IOException;
    void close();
    HtmlPageType getLoginPage();
    HtmlPageType getLogoutPage();
    WebClientType getWebClient();
    Optional<Tuple<String>> logonParam();
}
