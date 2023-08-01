package HW9_4;


    public class Calculator {
        // Функціональний інтерфейс для операцій калькулятора
        @FunctionalInterface
        interface MathOperation {
            double perform(double x, double y);
        }

        public static void main(String[] args) {
            MathOperation addition = (x, y) -> x + y;
            MathOperation subtraction = (x, y) -> x - y;
            MathOperation multiplication = (x, y) -> x * y;
            MathOperation division = (x, y) -> x / y;

            double num1 = 10.0;
            double num2 = 5.0;

            System.out.println("Додавання: " + calculate(num1, num2, addition));
            System.out.println("Віднімання: " + calculate(num1, num2, subtraction));
            System.out.println("Множення: " + calculate(num1, num2, multiplication));
            System.out.println("Ділення: " + calculate(num1, num2, division));
        }

        public static double calculate(double x, double y, MathOperation operation) {
            return operation.perform(x, y);
        }
    }

