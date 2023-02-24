package Java;

import java.util.Scanner;

public class Puissance {

	public static void main(String[] args) {
		// Déclaration des variables
		int nombre, puissance, resultat = 1, i;
		// Récupérer la fonction scanner
		Scanner console = new Scanner(System.in);
		// Saisir un nombre
		System.out.println("Saisir votre nombre: ");
		nombre = console.nextInt();
		// Saisir la puissance
		System.out.println("Saisir la puissance: ");
		puissance = console.nextInt();
		// Conditions et Loop for
		if (puissance < 0) {
			System.out.println("N'est pas capable de faire le calcul!");
		} else {
			for (i = 0; i < puissance; i++) {
				resultat = resultat * nombre;
			}
			System.out.println("Le Resultat de " + nombre + " puissance " + puissance + " est egale a " + resultat);
		}
		
		// fermer le scanner
		console.close();
	}
}
