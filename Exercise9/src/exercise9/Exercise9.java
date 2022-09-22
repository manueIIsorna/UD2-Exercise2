package exercise9;

import java.util.Scanner;

/**
 * Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
 * introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado
 * de la conversión.
 * 
 */
public class Exercise9 {
	public static void main(String[] args) {
		float money;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el valor que quiera pasar a euros: ");
		money = sc.nextFloat();
		System.out.printf("El total de pesetas en euros vendría siendo -> %.2f" + "€", (money * 0.0060));
	}
}