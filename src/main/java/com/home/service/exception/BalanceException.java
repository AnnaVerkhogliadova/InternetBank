package com.home.service.exception;

public class BalanceException extends RuntimeException {
    public BalanceException() {
        super("Недостаточно средств");
    }
}
