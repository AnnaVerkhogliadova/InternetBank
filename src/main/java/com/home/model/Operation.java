package com.home.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operation_id")
    private int id;

    @Column(name = "user_id")
    //@NotNull
    private int userId;

    @Column(name = "date", columnDefinition = "DATE")
    private LocalDate date;

    @Column(name = "type_of_operation")
    private String TypeOfOperation;

    @Column(name = "sum")
    private int sum;

    public Operation(int userId, LocalDate date, int sum, String typeOfOperation) {
        this.userId = userId;
        this.TypeOfOperation = typeOfOperation;
        this.sum = sum;
        this.date = date;
    }

    public Operation() {}

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTypeOfOperation() {
        return TypeOfOperation;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSum() {
        return sum;
    }
}