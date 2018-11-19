package practice;

import org.junit.Test;

import impleObjects.ProxyCalculator;
import impleObjects.RecCalculator;

public class DelegateTest{
    
    @Test
    public void delegateTest1(){
        ProxyCalculator pc = new ProxyCalculator(new RecCalculator());
        pc.factorial(10);
    }
}