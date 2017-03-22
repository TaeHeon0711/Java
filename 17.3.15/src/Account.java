import java.util.Scanner;

public class Account {
	
	private double account1 = 50.00;
	private double account2 = 0.00;
	
	public void debit() {
		
		System.out.printf("Enter withdrawal amount for account1 : ");
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		
		if(account1>=num1) {
			System.out.printf("subtracting %f from account1 balance \n", num1);
			account1 = account1 - num1;
			System.out.printf("account1 balance : %f\n", account1);
		}
		else {
			System.out.printf("Debit amount exceeded account balance.\n");
		}
		
		System.out.printf("Enter withdrawal amount for account2 : ");
		double num2 = input.nextDouble();
		
		if(account2>=num2) {
			System.out.printf("subtracting %f from account2 balance \n", num2);
			account2 = account2 - num2;
			System.out.printf("account1 balance : %f\n", account2);
		}
		else {
			System.out.printf("Debit amount exceeded account balance.\n");
		}
	}
	
	public Account(double b){
		account1 = b;
	}
	
		
}	

	
