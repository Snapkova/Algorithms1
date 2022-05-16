import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public  void  testMinMaxAveTestHappyPass(){
        int [] arr = {1,2,3,4,5,6,7,8};
        int n = 2;
        int m = 6;
        int [] expectedResult = {3,7,5};

        MinMaxAve mMA = new MinMaxAve();
         int [] actualResult = mMA.minMaxAve(arr,n,m);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
