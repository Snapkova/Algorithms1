public class BiggerValue {

    public int biggerValue(int number1, int number2){
        int max = number1;
        if(number1 > number2){
            return max;
        }else{
            max = number2;
        }
        return max;
    }

}
