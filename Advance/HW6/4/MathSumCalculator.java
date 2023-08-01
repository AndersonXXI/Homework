package Hw6_4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Math {
    int num1();
    int num2();
}
public class MathSumCalculator {
    // Використання анотації Math для вказівки параметрів методу mathSum
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        MathSumCalculator calculator = new MathSumCalculator();

        // Виклик методу mathSum з параметрами, переданими через анотацію Math
        try {
            Math mathAnnotation = MathSumCalculator.class.getMethod("mathSum", int.class, int.class)
                    .getAnnotation(Math.class);

            int num1 = mathAnnotation.num1();
            int num2 = mathAnnotation.num2();

            calculator.mathSum(num1, num2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
