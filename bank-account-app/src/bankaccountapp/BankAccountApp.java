package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chkacc1 = new Checking("Tom Wilson","321456788",1500);
		Savings savacc1 = new Savings("Rich Lowe","897397429",2500);
		chkacc1.showInfo();
		System.out.println("*****************");
		savacc1.showInfo();
	}

}
