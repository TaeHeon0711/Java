//import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
	
		double credit1 = 0, credit2 = 0;
		double debit1 = 0, debit2 = 0;
		
		Account account = new Account();
		
		System.out.printf("Input account1 : ");
		System.out.printf("Input account2 : ");
		account.credit();
		System.out.printf("account1 balance : %f\n", credit1);
		System.out.printf("account2 balance : %f\n", credit2);
		
		System.out.printf("Enter withdrawal amount for account1 : ");
		System.out.printf("Enter withdrawal amount for account2 : ");
		account.debit();
		
		System.out.printf("subtracting %f from account1 balance \n", debit1);
		account.balance();
	}
}
