import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class OddIndicesTest {
    @Test
    public void testOddIndicesHappyPass(){
        int[] input = {-45,590,234,985,12,68};
        int [] expectedResult = {590,985,68};

        OddIndices oI = new OddIndices();
        int[] actualResult = oI.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }




}
