package Java;

import java.util.Scanner;

public class Promo {

	public static void main(String[] args) {
		// Déclaration des variables
		float prix_principale;
		double prix_soldé;
		int type;

		// La Fonction Scanner
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir Le Prix Principale d'article: ");
		prix_principale = clavier.nextFloat();
		System.out.println("Saisir Le Type d'article: ");
		type = clavier.nextInt();

		// Conditions
		if (type == 1) {
			prix_soldé = prix_principale * 0.8;
			System.out.println("Le Prix Solde est egal à " + prix_soldé);
		} else if (type == 2) {
			prix_soldé = prix_principale * 0.6;
			System.out.println("Le Prix Solde est egal à " + prix_soldé);
		} else if (type == 3) {
			prix_soldé = prix_principale * 0.4;
			System.out.println("Le Prix Solde est egal à " + prix_soldé);
		} else {
			System.out.println("L' article n'est pas Soldé");
		}

		// Quitter la Scanner
		clavier.close();
	}
}