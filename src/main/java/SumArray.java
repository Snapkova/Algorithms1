public class SumArray {

    public int sumArray(int[] arr){
        int sumArr = 0;
        for( int i  = 0; i < arr.length; i++){
            sumArr = sumArr + arr[i];
        }
        return  sumArr;
    }


}
