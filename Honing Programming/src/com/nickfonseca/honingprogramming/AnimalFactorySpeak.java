package com.nickfonseca.honingprogramming;

public class AnimalFactorySpeak {

	public static void main(String[] args) {
		
		    // animal factory
		    AnimalFactory animalFactory = new AnimalFactory();

		    // produce a cow and speak
		    Animal cow = animalFactory.getAnimal("Cow");
		    cow.speak();

		    // produce a dog and speak
		    Animal dog = animalFactory.getAnimal("Dog");
		    dog.speak();

		    // produce a cat and speak
		    Animal cat = animalFactory.getAnimal("Cat");
		    cat.speak();
		}

	}