package com.example.haltest.haltest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "some")
public class SomeEntity {

    @Id
    @Column
    private int id;

    @Column
    private String message;

    @Column
    private String secondMessage;

    public SomeEntity() {
    }

    public SomeEntity(int id, String message, String secondMessage) {
        this.id = id;
        this.message = message;
        this.secondMessage = secondMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSecondMessage() {
        return secondMessage;
    }

    public void setSecondMessage(String secondMessage) {
        this.secondMessage = secondMessage;
    }
}
