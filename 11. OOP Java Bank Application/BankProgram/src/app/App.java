package app;


// ************************************************************************
// BankProgram.java	 Template created on 15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class App {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();
	static DecimalFormat twoDecimals = new DecimalFormat("0.00");

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println("Number: " + accountList.get(i).getAccountNumber() + " | Balance: "
					+ twoDecimals.format(accountList.get(i).getBalance()) + " euros");
		}
	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");
		System.out.println("Enter account number: ");
		String accountNumber = input.nextLine();

		if (findAccount(accountNumber) == null) {
			accountList.add(new Account(accountNumber));

			System.out.println();
			System.out.println("Account created successfully!");
		} else {
			System.out.println();
			System.out.println("Account not created. Account " + accountNumber + " exists already!");
		}

	}

	// Finds an account in accountList by given account number.
	// Returns either a reference to the account object
	// OR null if the account is not found in accountList.
	private static Account findAccount(String accountNumber) {
		Account myAccount = null;

		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().matches(accountNumber)) {
				myAccount = accountList.get(i);
			}
		}

		return myAccount;
	}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		System.out.println("Enter account number: ");
		String accountNumber = input.nextLine();

		

		if (findAccount(accountNumber) != null) {
			System.out.println("Enter the amount to be deposited: ");
			Double amount = Double.parseDouble(input.nextLine());
			if (amount > 0.00) {
				findAccount(accountNumber).deposit(amount);
				System.out.println();
				System.out.println("Deposit completed successfully!");
			} else {
				System.out.println("Cannot deposit a negative amount!");
			}

		} else {
			System.out.println();
			System.out.println("Account " + accountNumber + " does not exist!");
		}

	}

	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		System.out.println("Enter account number: ");
		String accountNumber = input.nextLine();

		

		if (findAccount(accountNumber) != null) {
			System.out.println("Enter the amount to be withdrawn: ");
			Double amount = Double.parseDouble(input.nextLine());
			if (amount > 0.00) {
				if (findAccount(accountNumber).withdraw(amount)) {
					System.out.println();
					System.out.println("Withdrawal completed successfully!");
				} else {
					System.out.println();
					System.out.println("Withdrawal not completed. Available balance is too low.");
				}
			} else {
				System.out.println("Cannot withdraw a negative amount!");
			}
		} else {
			System.out.println("Account " + accountNumber + " does not exist!");
		}

	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		System.out.println("Enter account number: ");
		String accountNumber = input.nextLine();

		if (findAccount(accountNumber) != null) {
			accountList.remove(findAccount(accountNumber));

			System.out.println();
			System.out.println("Account deleted successfully!");
		} else {
			System.out.println();
			System.out.println("Nothing deleted. Account " + accountNumber + " does not exist!");
		}

	}
}
// End


class Account {
	// Fields
	private String accountNumber;
	private double balance;

	// Constructor
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.00;
	}

	// Methods
	public void deposit(double amount) {
		this.balance += amount;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean withdraw(double amount) {
		if (amount > this.balance) {
			return false;
		} else {
			this.balance -= amount;
			return true;
		}

	}
}
// End