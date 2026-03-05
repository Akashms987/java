package Bank;

public class Bank1 {
	void interest() {
		System.out.println("Bank provides like loan");
		
	}
	void interest(double rate) {
	System.out.println("Bank provides double interest"+ rate+"%");
}

}

class sbi extends Bank1 {
	void interest(double rate, int years) {
		
		double total;
		double p=15000;
		total=p*rate*years;
		System.out.println("total interest"+total);
	}
}
