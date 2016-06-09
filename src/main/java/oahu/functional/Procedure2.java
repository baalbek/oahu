package oahu.functional;

/**
 * Created by rcs on 4/13/14.
 */


@FunctionalInterface
public interface Procedure2<T1,T2> {
    void apply(T1 v1, T2 v2);
}
