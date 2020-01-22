package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Aplication2 {

	// solucao sem orientação objeto.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//* variavel composta para representar o triangulo 
		Triangle x, y;
		// instaciando cada triangulo. 
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com tres numeros do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com tres numeros do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		System.out.printf("Triangulo x area: %.4f%n", areax);
		System.out.printf("Triangulo y area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("maior area: X");
		} else
			System.out.println("maior area: y");

		sc.close();
	}

}
