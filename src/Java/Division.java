package Java;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// Déclaration des variables
		float a, b, c;
		Scanner clavier = new Scanner(System.in);
		a = clavier.nextFloat();
		b = clavier.nextFloat();
		// Condition
		if (b == 0) {
			System.out.println("Erreur");
		} else {
			//
			c = a / b;
			System.out.println("Le résultat de l'opération de devision est égal à " + c);
		}
		// Fermeture du Scanner
		clavier.close();
	}

}
