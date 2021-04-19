public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    private static final String[] validPhoneNumbers = new String[] {
            "(84)-(0978489648)"
    };
    private static final String[] invalidPhoneNumbers = new String[] {
            "(a8)-(22222222)"
    };

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number:
             validPhoneNumbers) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("Number is " + number + " is valid: " + isValid);
        }
        for (String number:
             invalidPhoneNumbers) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("Number is " + number + " is valid: " + isValid);
        }
    }
}
