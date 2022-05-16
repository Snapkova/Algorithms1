import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualTestHappyPassPositiveNumber(){
        int num1 = 14;
        int num2 = 15;
        int expectedResult = -1;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.areNumbersEqual(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumbersEqualTestHappyPassNegativeNumber(){
        int num1 = -14;
        int num2 = -15;
        int expectedResult = 1;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.areNumbersEqual(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumbersEqualTestHappyPassPositiveAndNegativeNumber(){
        int num1 = 14;
        int num2 = -15;
        int expectedResult = 1;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.areNumbersEqual(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumbersEqualTestHappyPassPositiveNumberAndZero(){
        int num1 = 0;
        int num2 = 15;
        int expectedResult = -1;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.areNumbersEqual(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumbersEqualTestHappyPassTwoNumberZero(){
        int num1 = 0;
        int num2 = 0;
        int expectedResult = 0;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.areNumbersEqual(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumbersEqualTestHappyPassTwoNumberEqual(){
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.areNumbersEqual(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);

    }



}
