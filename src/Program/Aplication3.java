package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Aplication3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// * variavel composta para representar o triangulo
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

		// Chamando os métodos
		double Xreax = x.area();
		double Yreay = y.area();

		System.out.printf("Triangulo x area: %.4f%n", Xreax);
		System.out.printf("Triangulo y area: %.4f%n", Yreay);

		if (Xreax > Yreay) {
			System.out.println("maior area: X");
		} else
			System.out.println("maior area: y");

		sc.close();
	}

}
