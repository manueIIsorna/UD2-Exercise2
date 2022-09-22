package exercise7;

import java.util.Scanner;

/**
 * Escribir un programa que le pida al usuario su nombre, dirección y teléfono.
 * Guarda cada dato en variables distintas. A continuación, muestra los datos de
 * la siguiente forma:
 * 
 * Nombre: Elena 
 * Dirección: Calle Inventada 
 * Teléfono: 987654321
 */
public class Exercise7 {
	public static void main(String[] args) {
		String nombre;
		String address;
		String telephoneNumber;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca su nombre: ");
		nombre = sc.next();
		System.out.print("Introduzca su dirección: ");
		address = sc.next();
	
		System.out.print("Introduzca su teléfono: ");
		telephoneNumber = sc.next();
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + address);
		System.out.println("Teléfono: " + telephoneNumber);
	}
}