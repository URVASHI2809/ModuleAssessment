package CustomerAccounts;

import java.util.Scanner;

public class AccountsDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// create initial accounts
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		Accounts C[] = new Accounts[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new Accounts();
			C[i].openAccount();
		}
		// loop runs until number 5 is not pressed to exit
		int ch;
		do {
			System.out.println("\n ***Welcome to XYZ Online Banking***");
			System.out.println(
					"1. Display all account details \n 2. Search by Account type\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < C.length; i++) {
					C[i].showAccount();
				}
				break;
			case 2:
				System.out.print("Enter account type you want to search: ");
				String acc_types = sc.next();
				boolean found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(acc_types);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exists..!!");
				}
				break;
			case 3:
				System.out.print("Enter Account type : ");
				acc_types = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(acc_types);
					if (found) {
						C[i].deposit();
						System.out.println("Successfully deposited!!\n");
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exists..!!");
				}
				break;
			case 4:
				System.out.print("Enter Account type : ");
				acc_types = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(acc_types);
					if (found) {
						C[i].withdrawal();
						System.out.println("Withdrawal money done!!\n");
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exists..!!");
				}
				break;
			case 5:
				System.out.println("Thank You for connecting with our XYZ Bank!!");
				break;
			}
		} while (ch != 5);
	}

}
