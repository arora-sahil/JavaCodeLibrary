package com.java.serialize.deserailize;

import java.io.Serializable;

public class Animal implements Serializable {

    Dog dog;
    int id;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
