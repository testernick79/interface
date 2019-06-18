package com.nickfonseca.javaInterface;

public class Square implements Shape {
	float length;
	
	public Square(float length) {
		this.length = length;
	}
	
	public float area() {
		return length * length;
	}

}
