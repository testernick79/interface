package com.nickfonseca.L09PracticeHandsOn;

public class Dog extends Animal {
    public Dog() {
        super(new Animal.AnimalBuilder("dog", 2, 2, 2));
    }
}