package com.greetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Greeting {
    /*private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }*/
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String message;

    public Greeting(){

    }

    public Greeting(String message){
        this.message = message;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String newMessage){
        this.message = message;
    }
}

