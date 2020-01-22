package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductConta;

public class ProgramConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ProductConta account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char flag = sc.next().charAt(0);

		Double initialDeposit = 0.0;
		if (flag == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new ProductConta(number, holder, initialDeposit);
		} else {
			account = new ProductConta(number, holder);
		}
		System.out.println("account data:");
		System.out.println(account.toString());

		System.out.print("Enter a deposit value: ");
		Double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.print("updated account data:");
		System.out.println(account.toString());

		System.out.print("Enter a withdraw value: ");
		Double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.print("updated account data:");
		System.out.println(account.toString());
		sc.close();
	}

}
