package bankApp;

public class Transactions extends CreateAccount {
	
	double amount;
	double balance;
	
	public void deposit(double amount, String accno) {
		balance+=amount;
		System.out.println("Amount "+amount+" is deposited to account number "+accno);
		System.out.println("Available balance is "+balance);	
	}
	
	public void withdraw(double amount, String accno) {
		if(balance<amount) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Amount "+amount+" is withdrawn from "+accno);
			System.out.println("available balance is "+balance);
		}
	}
	
	public void getBalance() {
		System.out.println("Available balance in "+accno+" is "+balance);
	}
}
