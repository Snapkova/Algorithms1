public class StringToNumbers {

    public  String [] stringToNumbers( String numbers){
        if(numbers.length() > 0){
            numbers = numbers.trim();
            String [] resultArr = numbers.split(",");
            return resultArr;

        }else {
            return  new String[] {};
        }
    }
}
