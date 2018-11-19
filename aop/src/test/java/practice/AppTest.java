package practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import interfaces.Calculator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopPojo.xml");

        Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
        long fiveFact1 = impeCal.factorial(5);
        System.out.println("impeCal.factorial(5) = " + fiveFact1);

        Calculator recCal = ctx.getBean("recCal", Calculator.class);
        long fiveFact2 = recCal.factorial(5);
        System.out.println("recCal.factorial(5) = " + fiveFact2);
        assertTrue( true );
    }
}
