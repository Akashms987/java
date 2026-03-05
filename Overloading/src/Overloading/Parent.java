package Overloading;

public class Parent {
	void show() {
		System.out.println("Parent Static Method");
		
	}

}
class Child extends Parent  {
	void show() {
		System.out.println("Child Static Method");
		
	}
	public static void main(String []args) {
		Parent obj = new Child();
		obj.show();
	}
}
