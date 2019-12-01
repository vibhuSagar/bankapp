package bankApp;

public class CreateAccount {
	
	protected String accno;
	protected String name;
	protected double balance=0;
	
	public void create(String accno, String name) {
		this.accno=accno;
		this.name=name;
	}
	public void getBalance() {
		System.out.println("Available balance in "+accno+" is "+balance);
	}
	
}