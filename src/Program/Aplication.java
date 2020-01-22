package Program;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	// solucao sem orientação objeto.

	public static void main(String[] args) {
		double xA, xB, xC, yA, yB, yC;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com tres numeros do triangulo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Entre com tres numeros do triangulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		System.out.printf("Triangulo x area: %.4f%n", areax);
		System.out.printf("Triangulo y area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("maior area: X");
		} else
			System.out.println("maior area: y");

		sc.close();
	}

}
