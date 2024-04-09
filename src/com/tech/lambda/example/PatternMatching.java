package com.tech.lambda.example;


public class PatternMatching {
	
	static record Human (String name, int age, String profession) {}
	
	
//	public String checkObject(Object obj) {
//	    return switch (obj) {
//	        case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
//	        case Circle c -> "This is a circle";
//	        case Shape s -> "It is just a shape";
//	        case null -> "It is null";
//	        default -> "It is an object";
//	    };
//	}
//
//	public String checkShape(Shape shape) {
//	    return switch (shape) {
//	        case Triangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
//	        case Circle c && (c.getNumberOfSides() != 0) -> "This is a weird circle";
//	        default -> "Just a normal shape";
//	    };
//	}
	
	sealed class Shape permits Circle, Rectangle, Square {
		
		public void processShape(Shape shape) {
		    if (shape instanceof Circle circle) {
		        circle.draw();
		    } else if (shape instanceof Rectangle rectangle) {
		        rectangle.draw();
		    } else if (shape instanceof Square square) {
		        square.draw();
		    }
		}
		
//		public void processShapeJava17(Shape shape) {
//		    switch (shape) {
//		        case Circle circle -> circle.draw();
//		        case Rectangle rectangle -> rectangle.draw();
//		        case Square square -> square.draw();
//		    }
//		}
	}			
	
	
	final class Circle extends Shape{
		public void draw() {
			System.out.println("Drawing Circle");
		}
	}
	
	final class Rectangle extends Shape {
		public void draw() {
			System.out.println("Drawing Rectangle");
		}
	}
	
	final class Square extends Shape{
		public void draw() {
			System.out.println("Drawing Square");
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatternMatching patternMatching = new PatternMatching();
		//patternMatching.new() 
		Shape shape = patternMatching.new Circle();
		//Rectangle rectangle = new Rectangle();
		shape.processShape(shape);

	}

}
