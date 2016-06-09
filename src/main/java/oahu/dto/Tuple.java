package oahu.dto;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 1/3/13
 * Time: 2:14 PM
 */
public class Tuple<T> {
    private final T _first;
    private final T _second;
    public Tuple(T first, T second) {
        this._first = first;
        this._second = second;
    }
    public T first() {
        return _first;
    }
    public T second() {
        return _second;
    }
}
