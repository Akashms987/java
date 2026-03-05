package oop;

public class puppy extends Dog {
	void display() {
		System.out.println("puppy class");
		
	}
	public static void main (String args[]) {
		puppy ob=new puppy();
		ob.bark();
		ob.print();
		ob.display();
		
		
	}
	
	

}
