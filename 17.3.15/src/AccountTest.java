import java.util.Scanner;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account();
		
		System.out.printf("Input account1 : ");
		account1.credit();
		System.out.printf("Input account2 : ");
		account2.credit();
		
		System.out.printf("account1 balance : %f\n", account1.getBalance());
		System.out.printf("account2 balance : %f\n", account2.getBalance());
		
		System.out.printf("Enter withdrawal amount for account1 : ");
		Scanner input = new Scanner(System.in);
		double debit = input.nextDouble();
		account1.debit(debit);
		System.out.printf("subtracting %.2f from account1 balance \n", debit);
		System.out.printf("account1 balance : %f\n", account1.getBalance());
		System.out.printf("account2 balance : %f\n", account2.getBalance());
		
		System.out.printf("Enter withdrawal amount for account2 : ");
		debit = input.nextDouble();
		account2.debit(debit);
		
		System.out.printf("subtracting %f from account2 balance \n", debit);
		System.out.printf("account1 balance : %f\n", account1.getBalance());
		System.out.printf("account2 balance : %f\n", account2.getBalance());
		
	}
}
