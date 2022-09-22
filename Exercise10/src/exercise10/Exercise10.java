package exercise10;

import java.util.Scanner;

/**
 * Escribe un programa en el que declares una constante IVA de valor igual a 21.
 * A continuación, pídele un precio al usuario (recuerda que los precios
 * contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
 */
public class Exercise10 {
	public static void main(String[] args) {
		final int IVA = 21;
		float price;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el precio: ");
		price = sc.nextFloat();
		System.out.printf("El precio final es %.3f" + "€", ((price * (IVA / 100)) + price));
		sc.close();
	}
}