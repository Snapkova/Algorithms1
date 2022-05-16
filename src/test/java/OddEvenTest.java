import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {
    @Test
    public void testOddEvenHappyPathNegativeNumber(){
        int number = -345;
        String expectedResult = "Odd";

        OddEven od = new OddEven();
        String actualResult = od.oddEven( number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenHappyPathZeroNumber(){
        int number = 0;
        String expectedResult = "Even";

        OddEven od = new OddEven();
        String actualResult = od.oddEven( number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenHappyPathLargeNumber(){
        int number = 222222;
        String expectedResult = "Even";

        OddEven od = new OddEven();
        String actualResult = od.oddEven( number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenHappyPathIncorrectNumber(){
        long number = 2147483648l  ;
        String expectedResult = "Undefined";

        OddEven od = new OddEven();
        String actualResult = od.oddEven( number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
