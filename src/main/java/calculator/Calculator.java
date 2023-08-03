package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
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
}
