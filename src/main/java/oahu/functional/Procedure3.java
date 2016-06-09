package oahu.functional;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 16.05.14
 * Time: 14:11
 */
@FunctionalInterface
public interface Procedure3<T1,T2,T3> {
    void apply(T1 v1, T2 v2, T3 v3);
}