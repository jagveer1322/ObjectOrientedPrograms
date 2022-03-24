package bankaccount;

import java.util.Scanner;

public class Account {
	private String accNo;
	private String accName;
	private long accBalance;

	Scanner sc = new Scanner(System.in);

	void openAccount() {
		System.out.println("---------------------------");
		System.out.print("Type Acc. No: ");
		accNo = sc.next();
		System.out.print("Type Name: ");
		accName = sc.next();
		System.out.print("Type AccBalance: ");
		accBalance = sc.nextLong();

	}

	void showAccount() {
		System.out.println(accNo + "," + accName + "," + accBalance);
	}

	void deposit() {
		long amt;
		System.out.println("Type the amount you want to deposit : ");
		amt = sc.nextLong();
		accBalance = accBalance + amt;
	}

	void withdrawal() {
		long amt;
		System.out.println("Type the amount you want to withdraw : ");
		amt = sc.nextLong();
		if (accBalance >= amt) {
			accBalance = accBalance - amt;
		} else {
			System.out.println("Debit amount exceeded account balance. Transaction failed.");
		}
	}

	boolean search(String acn) {
		if (accNo.equals(acn)) {
			showAccount();
			return (true);
		}
		return (false);
	}

}
