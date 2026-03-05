package abstract1;

public interface Animal2 {
	void sound();
	void run();
		
}
class Cat1 implements Animal2 {
	public void sound() {
		System.out.println("Cat Meow");
		
		
	}
	public void run() {
		System.out.println("Cat run  fast");
	}
}
class Dog implements Animal2 {
	public void sound() {
		System.out.println("Dog bark");
	}
	public void run() {
		System.out.println("Dogs run fast");
	}

}
