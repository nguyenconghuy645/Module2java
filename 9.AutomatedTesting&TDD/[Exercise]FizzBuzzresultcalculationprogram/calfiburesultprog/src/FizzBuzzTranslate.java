public class FizzBuzzTranslate {
    public static String translate(int number) {
        String message = "";
        boolean equalZeroNumOne = number % 3 == 0;
        boolean notEqualZeroNumOne = number % 5 != 0;
        if (equalZeroNumOne && notEqualZeroNumOne) {
            message = "Fizz";
        } else {
            boolean equalZeroNumTwo = number % 5 == 0;
            boolean notEqualZeroNumTwo = number % 3 != 0;
            if (equalZeroNumTwo && notEqualZeroNumTwo) {
                message = "Buzz";
            } else if (equalZeroNumOne && equalZeroNumTwo) {
                message = "FizzBuzz";
            } else if (notEqualZeroNumOne && notEqualZeroNumTwo){
                message = number +  "";
            }
        }
        findNumber(number);
        return message;
    }
    public static String findNumber(int number) {
        String message = number + "";
        if (message.contains("3")) {
            message = "Fizz";
        } else if (message.contains("5")) {
            message = "Buzz";
        } else {
            message = number + "";
        }
        return message;
    }
}
