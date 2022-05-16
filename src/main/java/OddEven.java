public class OddEven {


    public String oddEven(long number) {
        if (number <= 2147483647L && number >= -2147483648L) {
            if (number % 2 == 0) {

                return "Even";
            } else {

                return "Odd";
            }

        }else {

            return "Undefined";
        }

    }
}