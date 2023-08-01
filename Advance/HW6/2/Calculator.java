package Hw6_2;

public class Calculator {
    /**
     * Returns the sum of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Returns the difference between two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The difference between a and b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Returns the product of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Returns the result of dividing one number by another.
     *
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of dividing a by b.
     * @throws ArithmeticException If b is equal to 0, an ArithmeticException will be thrown.
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
