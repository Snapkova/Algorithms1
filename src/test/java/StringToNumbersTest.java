import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    @Test
    public void testStringToNumbersHappyPassPositiveNumber(){
        String numbers = "1,2,3,4,5";
        int [] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers sTN = new StringToNumbers();
        String [] actualResult = sTN.stringToNumbers(numbers);

        Assertions.assertEquals(expectedResult, actualResult);



    }











}
