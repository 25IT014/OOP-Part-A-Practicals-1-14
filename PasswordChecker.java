
public class PasswordChecker {

    int count;

    boolean checkLength(String pw) {
        return pw.length() >= 8;
    }

    boolean checkUppercase(String pw) {
        return pw.matches(".*[A-Z].*");
    }

    boolean checkDigit(String pw) {
        return pw.matches(".*[0-9].*");
    }

    boolean checkSpecial(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    String strength(String pw) {

        count = 0;

        if (checkLength(pw))
            count++;

        if (checkUppercase(pw))
            count++;

        if (checkDigit(pw))
            count++;

        if (checkSpecial(pw))
            count++;

        if (count <= 1)
            return "Weak";
        else if (count <= 3)
            return "Medium";
        else
            return "Strong";
    }

    void displayRules(String pw) {

        System.out.println("Password: " + pw);

        System.out.println("Length >= 8: " + checkLength(pw));
        System.out.println("Uppercase: " + checkUppercase(pw));
        System.out.println("Digit: " + checkDigit(pw));
        System.out.println("Special Character: " + checkSpecial(pw));

        System.out.println("Strength: " + strength(pw));
        System.out.println("----------------------");
    }
}
