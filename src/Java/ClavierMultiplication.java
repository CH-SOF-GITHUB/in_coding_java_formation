package Java;

import java.util.Scanner;

public class ClavierMultiplication {

	public static void main(String[] args) {
		// Declaration des variables
		int a, b, c;

		// Saisie des valeurs
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez saisir la valeur de a: ");
		a = clavier.nextInt();
		System.out.println("Veuillez saisir la valeur de b: ");
		b = clavier.nextInt();
		// Calcul
		c = a * b;
		// Affichage
		System.out.println("Le resultat de la multiplication de " + a + " et " + b + " est egal a " + c);
		// Fermeture la fonction Scanner
		clavier.close();
	}

}
