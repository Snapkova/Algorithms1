import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReturnNumberTest {

    @Test
    public  void testReturnNumberHappyPassAllCondition(){
        int m = 15;
        String expectedResult = "Good Number";

        ReturnNumber rN = new ReturnNumber();
        String actualResult = rN.returnNumber(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public  void testReturnNumberHappyPassOneConditionFirst(){
        int m = 18;
        String expectedResult = "Bad Number";

        ReturnNumber rN = new ReturnNumber();
        String actualResult = rN.returnNumber(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public  void testReturnNumberHappyPassOneConditionSecond(){
        int m = 20;
        String expectedResult = "Poor Number";

        ReturnNumber rN = new ReturnNumber();
        String actualResult = rN.returnNumber(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public  void testReturnNumberHappyPassNotSatisfyCondition(){
        int m = 7;
        String expectedResult = "-1";

        ReturnNumber rN = new ReturnNumber();
        String actualResult = rN.returnNumber(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public  void testReturnNumberHappyPassNegativeNumber(){
        int m = -9;
        String expectedResult = "Bad Number";

        ReturnNumber rN = new ReturnNumber();
        String actualResult = rN.returnNumber(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
