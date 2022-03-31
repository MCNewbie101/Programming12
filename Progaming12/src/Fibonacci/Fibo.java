package Fibonacci;

public class Fibo {
    public int fibo(int remainTurns, int a, int b, int sum) {
        if (remainTurns == 0) {
            return b + sum;
        }
        return fibo(remainTurns - 1, b, a + b, sum + b);
    }
}
