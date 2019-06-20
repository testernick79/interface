package com.nickfonseca.L09PracticeHandsOn;

public class Cat extends Animal {
    public Cat() {
        super(new Animal.AnimalBuilder("cat", 1, 1, 1));
    }
}