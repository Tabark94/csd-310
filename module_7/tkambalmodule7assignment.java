import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tkambalmodule7assignment {

    private static final int MINIMUM_PASSWORD_LENGTH = 8;
    private static final Pattern LETTER_AND_DIGIT_PATTERN = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]*$");
    private static final Pattern UPPER_CASE_PATTERN = Pattern.compile("^(?=.*[A-Z]).*$");
    private static final Pattern LOWER_CASE_PATTERN = Pattern.compile("^(?=.*[a-z]).*$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        boolean isValid = isValidPassword(password);
        if (isValid) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }

    public static boolean isValidPassword(String password) {
        // Check the length of the password
        if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            return false;
        }

        Matcher letterAndDigitMatcher = LETTER_AND_DIGIT_PATTERN.matcher(password);
        if (!letterAndDigitMatcher.matches()) {
            return false;
        }


        Matcher upperCaseMatcher = UPPER_CASE_PATTERN.matcher(password);
        if (!upperCaseMatcher.matches()) {
            return false;
        }

        Matcher lowerCaseMatcher = LOWER_CASE_PATTERN.matcher(password);
        if (!lowerCaseMatcher.matches()) {
            return false;
        }

        return true;
    }
}
