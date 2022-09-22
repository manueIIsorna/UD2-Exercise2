package exercise4;

import java.util.Scanner;

/**
 * 4. Crear una aplicación que calcule la media aritmética de dos notas enteras.
 * Hay que tener en cuenta que la nota media puede tener decimales
 */
public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1;
		float nota2;
		double notaMedia;

		System.out.println("Which was your first exam mark?");
		nota1 = sc.nextFloat();
		System.out.println("Which was your second exam mark?");
		nota2 = sc.nextFloat();
		notaMedia = (nota1 + nota2) / 2;
		System.out.println("The average score is: " + notaMedia);
		sc.close();
	}
}
