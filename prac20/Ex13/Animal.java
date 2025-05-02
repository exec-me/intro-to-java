package prac20.Ex13;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }
}
