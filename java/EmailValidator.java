import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email address (or 'exit' to quit): ");
        while (true) {
            String email = scanner.nextLine();
            if (email.equalsIgnoreCase("exit")) {
                break;
            }

            if (isValidEmail(email)) {
                System.out.println("This is a valid email address.");
            } else {
                System.out.println("This is NOT a valid email address.");
            }
            System.out.println("Enter another email address (or 'exit' to quit): ");
        }
        
        scanner.close();
    }
}
