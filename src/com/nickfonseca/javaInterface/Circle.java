package com.nickfonseca.javaInterface;

public class Circle {
		float radius;
		
		public Circle(float radius) {
			this.radius = radius;
		
		}
		
		public float area() {
			return 3.14f * radius * radius;
		}
		
}
