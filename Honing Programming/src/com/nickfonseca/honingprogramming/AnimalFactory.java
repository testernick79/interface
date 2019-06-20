package com.nickfonseca.honingprogramming;

public class AnimalFactory {
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("cow")){
			return new Cow();
		}
		else if(animalType.equalsIgnoreCase("cat")) {
			return new Cat();
		}
		else if(animalType.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		else {
			System.out.println(animalType + " " + "Not recognized By Animal Factory");
			return null;
		}
	}

}