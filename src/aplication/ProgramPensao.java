package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensao;

public class ProgramPensao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Pensao[] vect = new Pensao[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			if (room >= vect.length) {
				room = vect.length - 1;
			}
			i = room;
			vect[i] = new Pensao(name, email, room);
		}

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);

		}
		sc.close();
	}

}
