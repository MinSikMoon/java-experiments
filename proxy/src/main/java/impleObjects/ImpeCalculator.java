package impleObjects;
import interfaces.Calculator;

public class ImpeCalculator implements Calculator{
    @Override
    public long factorial(long num){
        long start = System.currentTimeMillis();
        long result = 1;

        for(int i=1; i<=num; i++){
            result += i;
        }
        
        long end = System.currentTimeMillis();
        System.out.printf("ImpeCalculator(%d)->result: (%d) 실행시간 : %d\n", num, result, (end-start));
		return num;
    }
}