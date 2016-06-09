package oahu.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/21/13
 * Time: 3:46 PM
 */
public class HtmlConversionException extends  RuntimeException {
    private static final long serialVersionUID = 1L;

    public HtmlConversionException () {
        super();
    }

    public HtmlConversionException (String msg) {
        super(msg);
    }
}

