public class ReturnNumber {

    public String returnNumber(int m){
        if(m % 3 == 0 && m % 5 == 0){
            return "Good Number";
        }else if( m % 3 == 0 && m % 5!= 0){
            return  "Bad Number";
        }else if (m % 3 != 0 && m % 5== 0){
            return  "Poor Number";
        }else {
            return "-1";
        }
    }
}
