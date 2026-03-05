package Hybride;
interface Sports {
	void play();
}


class person{
	String name;
	person(String name){
		this.name=name;
	}
	
}
public class Student extends person implements Sports {
	Student(String name){
	super(name);
}

public void play() {
	System.out.println(name + "plays football");
}
}
