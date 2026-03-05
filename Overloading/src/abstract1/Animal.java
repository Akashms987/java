package abstract1;

abstract class Animal {
	void eat() {
		System.out.println("Animals eat some foood");
		
	}
	
	abstract void run();
}
class  Cat extends Animal {
//@Override
	void run() {
		System.out.println("Cats run fast");
		
	}
}
class Cheetah extends Animal {
	//Override
	void run() {
		System.out.println("Cheetah runs very fast");
	}
}

