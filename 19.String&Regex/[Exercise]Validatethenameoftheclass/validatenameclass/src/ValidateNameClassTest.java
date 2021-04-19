public class ValidateNameClassTest {
    private static ValidateNameClass validateNameClass;
    public static final String[] validNames = new String[] {
            "C0318G"
    };
    public static final String[] invalidNames = new String[] {
            "M0318G", "P0323A"
    };

    public static void main(String[] args) {
        validateNameClass = new ValidateNameClass();
        for (String name:
             validNames) {
            boolean isValid = validateNameClass.validate(name);
            System.out.println("Name is " + name + " is valid: " + isValid);
        }
        for (String name:
             invalidNames) {
            boolean isValid = validateNameClass.validate(name);
            System.out.println("Name is " + name + " is valid: " + isValid);
        }
    }
}
