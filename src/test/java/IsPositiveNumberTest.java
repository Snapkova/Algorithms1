import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHappyPassPositiveNumber(){
        int num = 555;
        boolean expectedResult = true;

        IsPositiveNumber iPN = new IsPositiveNumber();
        boolean actualResult = iPN.isPositiveNumber(num);

        Assertions.assertEquals (expectedResult,actualResult);

    }
    @Test
    public void testIsPositiveNumberHappyPassZero(){
        int num = 0;
        boolean expectedResult = true;

        IsPositiveNumber iPN = new IsPositiveNumber();
        boolean actualResult = iPN.isPositiveNumber(num);

        Assertions.assertEquals (expectedResult,actualResult);

    }
    @Test
    public void testIsPositiveNumberHappyPassNegativeNumber(){
        int num = -555;
        boolean expectedResult = false;

        IsPositiveNumber iPN = new IsPositiveNumber();
        boolean actualResult = iPN.isPositiveNumber(num);

        Assertions.assertEquals (expectedResult,actualResult);

    }




}
