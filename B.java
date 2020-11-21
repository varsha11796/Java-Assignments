package com.abc;


class A{
	
	void One() {
		System.out.println("A's one");
	}
	
}

	/*creating parent class 
		array which stores child class objects.*/

public class B extends A{
	void One() {
		System.out.println("B's one");
	}
	
	void Second() {
		System.out.println("B's Second");
	}
	
	public static void main(String[] args) {
		
		
		A a1[] = new A[3];		// creating Parent class Array
		
		
		for(int i=0; i<a1.length;i++) {
			a1[i] = new B();	// storing child class object into Parent class Array
		}

		for(int i=0; i<a1.length;i++) {
			a1[i].One();		// B's method will get execute
			
		}
		System.out.println("****DOWNCAST");
		
		for(int i=0; i<a1.length;i++) {
			B b1 = (B)a1[i];	// Downcast
			b1.Second();
			
		}
		
	}
}
