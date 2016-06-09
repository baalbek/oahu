package oahu.functional;

/**
 * Created by rcs on 4/13/14.
 */


@FunctionalInterface
public interface Procedure4<T1,T2,T3,T4> {
   void apply(T1 v1, T2 v2, T3 v3, T4 v4);
}

