package exercise6;

import java.util.Scanner;

/**
 * Escribir un programa que le pida dos números al usuario. A continuación, debe
 * mostrar la suma, la resta, la multiplicación y la división de ambos números.
 * Debe mostrarse el resultado de cada operación en una línea distinta.
 */
public class Exercise6 {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca los dos números separados por un espaciado: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("El total de la suma sería: " + (num1 + num2));
		System.out.println("El total de la resta sería: " + (num1 - num2));
		System.out.println("El total de la multiplicación sería: " + (num1 * num2));
		System.out.println("El total de la división sería: " + (num1 / num2));
	}
}
