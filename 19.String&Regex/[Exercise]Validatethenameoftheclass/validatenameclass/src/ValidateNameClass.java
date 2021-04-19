import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_CLASS = "^[CAP][0-9][0-9][0-9][0-9][GHIKLM]$";

    public ValidateNameClass() {
        pattern = Pattern.compile(NAME_CLASS);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
