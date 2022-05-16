import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    @Test
    public void testSumArrayHappyPassPositiveNumber(){
        int [] testData = {0,1,2,3,4,5};
        int expectedResult = 15;

        SumArray sA = new SumArray();
        int actualResult = sA.sumArray(testData);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testSumArrayHappyPassNegativeNumber(){
        int [] testData = {-7,-3};
        int expectedResult = -10;

        SumArray sA = new SumArray();
        int actualResult = sA.sumArray(testData);

        Assertions.assertEquals(expectedResult,actualResult);

    }





}
