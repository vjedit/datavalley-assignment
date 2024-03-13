// Custom exception class
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

// Main class
public class MyClass {
    // Method that throws CustomValidationException if the input number is negative
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    // Main method to test the custom exception
    public static void main(String[] args) {
        int number = -5; // Test input number
        try {
            validateNumber(number); // Call the method that may throw the custom exception
            System.out.println("Number is valid: " + number);
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
