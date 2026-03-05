package multipleinheritance;

public interface browser1{
	void b1() ;
	
}
interface b2{
	void b2();
	
}
interface b3{
	void b3();
}
	


class browser implements browser1, b2, b3 {
	public void b1() {
		System.out.println("Google Chrome");
	}
	public void b2() {
		System.out.println("Safari");
		
	}
	public void b3 () {
		System.out.println("Mozilla Firefox");
	}
	
}
