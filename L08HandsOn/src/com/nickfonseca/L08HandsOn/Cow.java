package com.nickfonseca.L08HandsOn;

public class Cow implements Mammal, Animal{
	@Override
    public void speak() {
        System.out.println("Moo!");

    }

    @Override
    public void run() {
        System.out.println("Cows can run at a top speed of 25 mph!");

    }

    @Override
    public void eat() {
        System.out.println("Cows eat grass.");

    }
}