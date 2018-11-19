package practice;

import org.junit.Test;

import impleObjects.RecCalculator;

public class RecCalcTest{
    
    @Test
    public void recTest1(){
        RecCalculator rc = new RecCalculator();
        rc.factorial(10);
    }
}