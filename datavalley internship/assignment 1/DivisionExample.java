public class DivisionExample {
    // Method to perform division
    public static double divideNumbers(int numerator, int denominator) {
        // Check if the denominator is zero
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        // Perform division
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
