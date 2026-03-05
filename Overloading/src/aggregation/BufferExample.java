package aggregation;

public class BufferExample {
	public void stringInsert() {
		StringBuffer buffer = new StringBuffer("JA");
		System.out.println("Old String: " + buffer);
		buffer.insert(1, "AV");
		System.out.println("New String: " + buffer);
	}
	public void stringAppend() {
		StringBuffer buffer = new StringBuffer("SNPSU");
		System.out.println("Old String: " + buffer);
		buffer.append("ISE");
		System.out.println("New String: " + buffer);
	}
	public void stringReverse() {
		StringBuffer buffer = new StringBuffer("HOO");
		System.out.println("Old String: " + buffer);
		
		System.out.println("New String: " + buffer);
		
	}
	public static void main(String[] args) {
		new BufferExample().stringInsert();
		new BufferExample().stringAppend();
		new BufferExample().stringReverse();
	}

}
