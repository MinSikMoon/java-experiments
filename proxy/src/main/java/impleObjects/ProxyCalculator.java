package impleObjects;

import interfaces.Calculator;

public class ProxyCalculator implements Calculator{
    //delegate object
    private Calculator delegate; 
    //constructor
    public ProxyCalculator(Calculator delegate){
        this.delegate = delegate;
    }
    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long result = delegate.factorial(num);
        long end = System.nanoTime();
        System.out.printf("proxycalc(%d) 실행시간 : %d\n", num, (end-start));
        return result;
    }
}