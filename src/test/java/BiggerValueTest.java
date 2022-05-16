import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValueHappyPassPositiveNumber(){
        int num1 = 3333;
        int num2 = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult  = bV.biggerValue(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testBiggerValueHappyPassNegativeNumber(){
        int num1 = -3333;
        int num2 = -9999;
        int expectedResult = -3333;

        BiggerValue bV = new BiggerValue();
        int actualResult  = bV.biggerValue(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testBiggerValueHappyEgualNumber(){
        int num1 = 3333;
        int num2 = 3333;
        int expectedResult = 3333;

        BiggerValue bV = new BiggerValue();
        int actualResult  = bV.biggerValue(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testBiggerValueHappyOneNumberZero(){
        int num1 = 0;
        int num2 = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult  = bV.biggerValue(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testBiggerValueHappyOneNumberTwoZero(){
        int num1 = 0;
        int num2 = 0;
        int expectedResult = 0;

        BiggerValue bV = new BiggerValue();
        int actualResult  = bV.biggerValue(num1,num2);

        Assertions.assertEquals(expectedResult,actualResult);


    }








}
