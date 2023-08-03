package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("error");
        }
        return a / b;
    }

    public int power(int a, int b) {
        int result = 1;
        while (b != 0) {
            result *= a;
            b--;
        }
        return result;
    }

    public int calculate(int a, int b, char operator){
        switch (operator){
            case '+':
                return add(a,b);
            case '*':
                return multiply(a,b);
            case '/':
                return divide(a,b);
            case '^':
                return power(a,b);
            default:
                throw new RuntimeException("error");

        }
    }
}
