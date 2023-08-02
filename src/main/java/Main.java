public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }

    public static class Calculator {
        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
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
}
