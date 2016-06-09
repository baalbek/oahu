package oahu.functional;

/**
 * Created by rcs on 13.06.15.
 */
@FunctionalInterface
public interface Procedure5<T1,T2,T3,T4,T5> {
    void apply(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5);
}
