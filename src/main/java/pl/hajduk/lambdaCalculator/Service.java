package pl.hajduk.lambdaCalculator;

public class Service<T> {

    public void process(T x,T y,MyCallback<T> cb)
    {
        System.out.println(cb.operation(x,y));
    }
}
