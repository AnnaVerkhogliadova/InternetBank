package com.home.dto;

public class TransferRequest {

    private int idFromWhom;
    private int idFromTo;
    private int balance;

    public TransferRequest(int idFromWhom, int idFromTo, int balance) {
        this.idFromWhom = idFromWhom;
        this.idFromTo = idFromTo;
        this.balance = balance;
    }

    public TransferRequest() { }

    public int getIdFromWhom() {
        return idFromWhom;
    }

    public int getIdFromTo() {
        return idFromTo;
    }

    public int getBalance() {
        return balance;
    }
}
