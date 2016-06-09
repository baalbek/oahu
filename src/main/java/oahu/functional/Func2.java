package oahu.functional;

/**
 * Created by rcs on 03.06.15.
 *
 */
@FunctionalInterface
public interface Func2<T1,T2,R> {
    R apply(T1 t1, T2 t2);
}
