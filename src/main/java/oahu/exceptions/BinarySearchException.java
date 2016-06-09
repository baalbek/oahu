package oahu.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/21/13
 * Time: 3:46 PM
 */
public class BinarySearchException extends  RuntimeException {
    private static final long serialVersionUID = 1L;

    public BinarySearchException() {
        super();
    }

    public BinarySearchException(String msg) {
        super(msg);
    }
}

