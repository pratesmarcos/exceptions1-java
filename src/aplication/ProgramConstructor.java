package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductConstructor;

public class ProgramConstructor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		ProductConstructor product = new ProductConstructor(name, price, quantity);

		product.setName("Computer");

		product.setPrice(price);
		System.out.println("Updated price: " + product.getPrice());
		System.out.println();
		System.out.println("Product data: " + product.toString());

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("update data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("update data: " + product);

		sc.close();
	}

}
