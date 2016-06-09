package oahu.functional;

/**
 * Created by rcs on 03.06.15.
 *
 */
@FunctionalInterface
public interface Func3<T1,T2,T3,R> {
    R apply(T1 t1, T2 t2, T3 t3);
}
