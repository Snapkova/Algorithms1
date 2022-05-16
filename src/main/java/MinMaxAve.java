public class MinMaxAve {


    public int [] minMaxAve(int [] arr, int n, int m){
        int[] result =  new int [3];
        int min= arr[n];
        int max = arr[m];
        int sum = 0;
        int ave = 0;
        for(int i = n; i <= m;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            result[0] = min;
        }
        for(int i = n; i <= m;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            result[1] = max;
        }
        for(int i = n; i <= m;i++){
            sum = sum + arr[i];
            ave = sum/ (m-n + 1);
        }
        result[2] = ave;
        return result;
    }


}
