package oopsbyashokIt;

public class HDFCBank implements Interfaces {

	
	public void moneyTransfer() {
		
		System.out.println("Money Transferring....");
	}

	
	public void checkBalance() {
		System.out.println("Checking Balance..");
		
	}
	
	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.moneyTransfer();
		hb.checkBalance();
	}
	
	
}
