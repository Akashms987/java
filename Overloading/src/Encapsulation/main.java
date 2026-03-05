package Encapsulation;

public class main {
	public static void main(String args[]) {
		Student  ob = new Student("Akash ",15);
		System.out.println(ob.getname());
		
		ob.setname("M S");
		System.out.println(ob.getname());
		
	}

}
