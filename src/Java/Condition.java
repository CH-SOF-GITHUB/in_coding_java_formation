package Java;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// Déclaration des variables
		int x;
		// Initialisation de variable
		Scanner clavier = new Scanner(System.in);
		x = clavier.nextInt();
		// Condition sur x
		if (x > 0) {
			System.out.println("x est positive");

		} else if (x == 0) {
			System.out.println("neutre");
		} else {
			System.out.println("x est negative");
		}
	}

}
