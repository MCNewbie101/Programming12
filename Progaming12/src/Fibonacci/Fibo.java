package Fibonacci;

public class Fibo {
    public int fibo(int remainTurns, int a, int b) {
        if (remainTurns == 0) {
            return b;
        }
        return fibo(remainTurns - 1, b, a + b);
    }
}
