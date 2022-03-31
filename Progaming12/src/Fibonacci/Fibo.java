package Fibonacci;

public class Fibo {
    public int fibo(int remainTurns, int a, int b) {
        if (remainTurns == 1) {
            return b;
        }
        return fibo(remainTurns, b, a + b);
    }
}
