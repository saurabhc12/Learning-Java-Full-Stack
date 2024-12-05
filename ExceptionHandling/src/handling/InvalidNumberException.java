package handling;

public class InvalidNumberException extends Exception {
    
    // Constructor with a default message
    public InvalidNumberException() {
        super("Invalid number entered.");
    }

    // Constructor with a custom message
    public InvalidNumberException(String message) {
        super(message);
    }
}