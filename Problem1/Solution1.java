package Problem1;

public class Solution1 {
    static class Calculator {
        public double calculate(double a, double b, String op) {
            switch (op.toLowerCase()) {
                case "add":
                    return a + b;
                case "sub":
                    return a - b;
                case "mul":
                    return a * b;
                case "div":
                    if (b == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return a / b;
                default:
                    throw new IllegalArgumentException("Invalid operation type");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator cal = new Calculator();
        System.out.println("Result = " + cal.calculate(a, b, op));

    }
}