package com.example.ukmku.model;

public class Transactions {
    private Sell transaction;

    public Transactions(Sell transaction) {
        this.transaction = transaction;
    }

    public Sell getTransaction() {
        return transaction;
    }

    public void setTransaction(Sell transaction) {
        this.transaction = transaction;
    }
}
