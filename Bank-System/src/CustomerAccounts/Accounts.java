package CustomerAccounts;

import java.util.Scanner;
  
import java.util.Date;  

public class Accounts {

	private String name;
	private String acc_type;
	private long balance;
	private String address;
	private String city;
	private int pin;
	private long phone_no;
	private int house_no;
	private String street;
	private String status;
	
	Scanner sc = new Scanner(System.in);


	// method to open new account
	public void openAccount() {
		
		System.out.print("Enter Account type: ");
		acc_type = sc.next();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Balance: ");
		balance = sc.nextLong();
		System.out.print("Enter Local Address: ");
		address = sc.next();
		System.out.print("Enter City: ");
		city = sc.next();
		System.out.print("Enter Pin: ");
		pin = sc.nextInt();
		System.out.print("Enter Phone number: ");
		phone_no = sc.nextLong();
		System.out.print("Enter House number: ");
		house_no = sc.nextInt();
		System.out.print("Enter Street: ");
		street = sc.next();
		System.out.println("\n");
	}

	// method to display account details
	public void showAccount() {
		System.out.println("Name of account holder: " + name);
		System.out.println("Account type: " + acc_type);
		System.out.println("Balance: " + balance);
		System.out.println("Address: " + address);
		System.out.println("City: " + city);
		System.out.println("Pin: " + pin);
		System.out.println("Phone number: " + phone_no);
		System.out.println("House number: " + house_no);
		System.out.println("Street: " + street);
	
		Date date = new Date();
	    System.out.print("Created date:" +date);
	    System.out.println("\n");
	
	    Accounts status1 = new Accounts();
	   if(balance<=5000) {
		   System.out.println("Active\n" +status1);
	   }else {
		   System.out.println("Inactive\n" +status1);
	   }
	}

	// method to deposit money
	public void deposit() {
		long amt;
		System.out.println("Enter the amount you want to deposit: ");
		amt = sc.nextLong();
		balance = balance + amt;
	}

	// method to withdraw money
	public void withdrawal() {
		long amt;
		System.out.println("Enter the amount you want to withdraw: ");
		amt = sc.nextLong();
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
		}
	}

	public boolean search(String acc_types) {
		if(acc_type.equals(acc_types)) {
			showAccount();
			return(true);
		}
		return (false);
	}

}
