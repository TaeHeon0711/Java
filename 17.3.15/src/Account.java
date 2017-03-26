import java.util.Scanner;

public class Account {
	
	private double balance;
	private double account1;
	private double account2;
	
	//adds money to an account
	public void credit() { 
		
		// System.out.printf("Input account1 : ");
		Scanner input = new Scanner(System.in);
		double credit1 = input.nextDouble();
		
		//System.out.printf("Input account2 : ");
		double credit2 = input.nextDouble();
		
		//System.out.printf("account1 balance : %f\n", credit1);
		//System.out.printf("account2 balance : %f\n", credit2);
		}

	//withdraws money from an account
	public void debit() {

		//System.out.printf("Enter withdrawal amount for account1 : ");
		Scanner input = new Scanner(System.in);
		double debit1 = input.nextDouble();
		
		//System.out.printf("Enter withdrawal amount for account2 : ");
		double debit2 = input.nextDouble();
	}
	
	//shows the balance of an account
	public void balance() {
		
	}

	
	/*	public Account(double b){
		account1 = b;
	}*/
	
	
		
}	

	
