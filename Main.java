package bankApp;

import java.util.Scanner;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		CreateAccount obj = new CreateAccount();
		Transactions t=new Transactions();
	
		 
		System.out.println("1. Create Account\n2. View Balance\n3. Deposit Ammount\n4. Withdraw Ammount\n4. Exit");
		System.out.println("Select your option");
		Scanner s =new Scanner(System.in);
		int op=s.nextInt();
		
		switch(op) {
		
		case 1:System.out.println("Enter name and account number");
		String name=s.nextLine();
		String acno=s.nextLine();
		obj.create(acno, name);
		System.out.println("Account Created");
		break;
		
		

		case 2: obj.getBalance();
		break;
		
		case 3:System.out.println("Enter your account number");
		String accno=s.nextLine();
		System.out.println("Enter ammount");
		double amt=s.nextDouble();
		t.deposit(amt,accno);
		break;
		
		case 4:System.out.println("Enter your account number");
		String accn=s.nextLine();
		System.out.println("Enter ammount");
		double amtt=s.nextDouble();
		t.withdraw(amtt,accn);
		break;
		
		case 5:
			System.exit(0);
			
		}
		
		
		

		
	}
}
	

