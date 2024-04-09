package com.tech.lambda.example;

sealed class A  extends Thread implements Cloneable permits B,C {
	
}

sealed class B extends A permits D{
	
}

final class C extends A{
	
}

final class D extends B{
	
}


sealed interface X permits Y{
	
}

sealed interface Y extends X {
	
}

public class SealedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am running");

	}

}
