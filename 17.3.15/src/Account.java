import java.util.Scanner;

public class Account {
	
	private double balance;
	
	//adds money to an account
	public void credit() { 
		Scanner input = new Scanner(System.in);
		double credit = input.nextDouble();
		balance = credit;
		}

	//withdraws money from an account
	public void debit(double amount) {
		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Debit amount exceeded account balance.");
		}
	}
	
	//shows the balance of an account
	public double getBalance() {
		return balance;
	}

}	

	
