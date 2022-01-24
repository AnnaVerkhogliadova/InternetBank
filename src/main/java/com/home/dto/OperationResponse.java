package com.home.dto;

import java.time.LocalDate;

public class OperationResponse {
    int id;
    int userId;
    String TypeOfOperation;
    int sum;
    LocalDate data;

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

    public OperationResponse(int id, int user_id, LocalDate data, int sum, String typeOfOperation) {
        this.id = id;
        this.userId = userId;
        this.TypeOfOperation = typeOfOperation;
        this.sum = sum;
        this.data = data;
    }

    public OperationResponse(){}
}
