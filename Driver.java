
public class Driver {

    public static void main(String[] args) {

        PasswordChecker obj = new PasswordChecker();

        obj.displayRules("abc");
        obj.displayRules("Abcd1234!");
        obj.displayRules("hello123");
        obj.displayRules("HELLO@123");
    }
}
