package exercise8;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario su nombre y su edad y muestre por
 * pantalla el siguiente mensaje: “Hola Juanito, tienes 21 años, ¡qué mayor
 * eres!”. Los datos en rojo son los datos introducidos por el usuario.
 */
public class Exercise8 {
	public static void main(String[] args) {
		String name;
		String age;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca su nombre: ");
		name = sc.next();
		System.out.print("Introduzca su edad: ");
		age = sc.next();

		System.out.print("Hola " + name + ", tienes " + age + " años, ¡Qué mayor eres!");
	}
}