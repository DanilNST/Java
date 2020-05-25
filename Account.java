package com.company;

public class Account {
    private static int idT = 0;
    public int id;
    private int total;

    public Account(int total) {
        this.id = idT++;
        this.total = total;
    }

    public void withdraw(int amount) throws LessMoneyException {
        if (total >= amount) {
            total -= amount;
        } else {
            throw new LessMoneyException();
        }
    }

    public void deposit(int amount) {
        total += amount;
    }

    public int getTotal() {
        return total;
    }
}