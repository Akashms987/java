package Hybride;

public interface Cat {
	default void sound() {
		System.out.println("meeeow");
		
	}

}
interface Dog {
	default void sound() {
		System.out.println("Dog is baarking");
	}
}
class Cog implements Cat, Dog { 
	public void sound() {
		Dog.super.sound();
	}
}