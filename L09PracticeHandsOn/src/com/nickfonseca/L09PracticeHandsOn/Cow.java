package com.nickfonseca.L09PracticeHandsOn;

public class Cow extends Animal {
    public Cow() {
        super(new Animal.AnimalBuilder("cow", 3, 3, 3));
    }
}