public class OddIndices {

    public  int[] oddIndices( int [] arr) {
        if (arr.length != 0) {
            int newArrLength = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1) {
                    newArrLength++;
                }
            }
            int[] newArr = new int[newArrLength];
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1) {
                    newArr[counter] = arr[i];
                    counter++;
                }
            }
            return newArr;
        }return  new int [] {};
    }




}
