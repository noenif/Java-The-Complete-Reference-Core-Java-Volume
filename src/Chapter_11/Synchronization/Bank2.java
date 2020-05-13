package Chapter_11.Synchronization;

import java.util.*;

public class Bank2 {
    private final double[] accounts;


    public Bank2(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int from, int to, double amount)
            throws InterruptedException {
        while (accounts[from] < amount)
            wait(); // wait on intrinsic object lock's single condition
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        notifyAll(); // notify all threads waiting on the condition
    }

    public double getTotalBalance() {
        double sum = 0;

        for (double a : accounts)
            sum += a;

        return sum;
    }

    public int size() {
        return accounts.length;
    }
}