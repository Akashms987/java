package Overloading;

public class Overriding {
	void sound() {
		System.out.println("Animal makes a sound");
		
	}
	

}
class Dog extends Overriding {
	void sound() {
		super.sound();
	
		System.out.println("Dog barks");
	}
	
}
