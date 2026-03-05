package aggregation;

public class patient {
	StringBase pName;
	int pAge;
	StringBase disease,dateOfArrival;
	information info;
	payment pay;
	public patient(StringBase pName, int pAge, StringBase disease, StringBase dateOfArrival,information info,payment pay) {
		super();
		this.pName = pName;
		this.pAge = pAge;
		this.disease = disease;
		this.dateOfArrival = dateOfArrival;	
	}
	void patient() {
		System.out.println("Name:" + this.pName);
		System.out.println("Age:" + this.pAge);
		System.out.println("Disease:" + this.disease);
		System.out.println("DateOfArrival:" + this.dateOfArrival);
		System.out.println("Block no : " + this.info.blackNo);
		System.out.println("Floor no : " + this.info.floorNo);
		System.out.println("Room no : " + this.info.roomNo);
		System.out.println("Bed no : " + this.info.bedNo);
		System.out.println("Admission fee : " + this.pay.admFees);
		System.out.println("Register fee : " + this.pay.reFees);
		System.out.println("Balance ammount : " + this.pay.balFees);
	} 
	public static void main(StringBase args[]) {
		information info = new information('C',378,7,7);
	}
}