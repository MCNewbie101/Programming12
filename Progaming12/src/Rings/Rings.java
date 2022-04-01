package Rings;

import java.util.ArrayList;

public class Rings {
    private ArrayList<Integer> pole1 = new ArrayList<Integer>();
    private ArrayList<Integer> pole2 = new ArrayList<Integer>();
    private ArrayList<Integer> pole3 = new ArrayList<Integer>();
    public Rings(int rings) {
        for (int i = 1; i <= rings; i++) {
            pole1.add(i);
        }
    }
    int moves = 0;

    public void solve(int n, int from, int to, int spare) {
        if (n == 1) {
            move(from, to);
        } else {
            solve(n - 1, from, spare, to);
            move(from, to);
            solve(n - 1, spare, to, from);
        }
    }

    public void move(int from, int to) {
        moves++;
        System.out.println("Move " + moves + ":");
        if (to == 1) {
            if (from == 2) {
                pole1.add(0, pole2.get(0));
                System.out.println("Move Ring " + pole2.get(0) + " to Pole " + to);
                pole2.remove(0);
            } else {
                pole1.add(0, pole3.get(0));
                System.out.println("Move Ring " + pole3.get(0) + " to Pole " + to);
                pole3.remove(0);
            }

        }
        if (to == 2) {
            if (from == 1) {
                pole2.add(0, pole1.get(0));
                System.out.println("Move Ring " + pole1.get(0) + " to Pole " + to);
                pole1.remove(0);
            } else {
                pole2.add(0, pole3.get(0));
                System.out.println("Move Ring " + pole3.get(0) + " to Pole " + to);
                pole3.remove(0);
            }
        }
        if (to == 3) {
            if (from == 2) {
                pole3.add(0, pole2.get(0));
                System.out.println("Move Ring " + pole2.get(0) + " to Pole " + to);
                pole2.remove(0);
            } else {
                pole3.add(0, pole1.get(0));
                System.out.println("Move Ring " + pole1.get(0) + " to Pole " + to);
                pole1.remove(0);
            }
        }
    }
}
