package com.nickfonseca.L08HandsOn;

public class Cat implements Mammal, Animal{
	@Override
	public void speak() {
		System.out.println("Meow!");
	}
	
	@Override
	public void run() {
		System.out.println("Cats can run at a top speed of 30 mph!");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Cats eat mice.");
	}

}
