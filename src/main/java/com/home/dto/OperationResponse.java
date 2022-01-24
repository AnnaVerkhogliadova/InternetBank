package com.home.dto;

import java.time.LocalDate;

public class OperationResponse {
    private final int id;
    private final int userId;
    private final String TypeOfOperation;
    private final int sum;
    private final LocalDate data;

    public OperationResponse(int id, int userId, LocalDate data, int sum, String typeOfOperation) {
        this.id = id;
        this.userId = userId;
        this.TypeOfOperation = typeOfOperation;
        this.sum = sum;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTypeOfOperation() {
        return TypeOfOperation;
    }

    public int getSum() {
        return sum;
    }

    public LocalDate getData() {
        return data;
    }
}
