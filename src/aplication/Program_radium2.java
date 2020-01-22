package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator3;

public class Program_radium2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator3.circumference(radius);

		double y = Calculator3.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume:  %.2f%n", y);
		System.out.printf("PI:  %.2f%n", Calculator3.PI);
		sc.close();
	}

}
