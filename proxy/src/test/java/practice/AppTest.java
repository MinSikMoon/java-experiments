package practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import impleObjects.ImpeCalculator;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        ImpeCalculator calc = new ImpeCalculator();
        calc.factorial(100);
        assertTrue( true );
    }
}
