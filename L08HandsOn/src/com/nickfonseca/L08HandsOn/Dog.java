package com.nickfonseca.L08HandsOn;

public class Dog implements Mammal, Animal{
	@Override
    public void speak() {
        System.out.println("Bark!");

    }

    @Override
    public void run() {
        System.out.println("Dogs can run at a top speed of 45 mph!");

    }

    @Override
    public void eat() {
        System.out.println("Dogs eat bones.");

    }
}
