package pl.hajduk.lambdaCalculator;

@FunctionalInterface
public interface MyCallback<T> {
    T operation(T x,T y);

}
