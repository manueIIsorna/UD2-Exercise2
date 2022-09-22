package exercise3;

import java.util.Scanner;

/**
 * 3. Escribir una aplicación que pida el año actual y el año de nacimiento del
 *    usuario. Debe calcular su edad.
 */
public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte edad;
		int anhoActual;
		short anhoNacimiento;

		System.out.println("In which year are we?");
		anhoActual = sc.nextInt();
		System.out.println("When did you born? (year)");
		anhoNacimiento = sc.nextShort();
		edad = (byte) (anhoActual - anhoNacimiento);
		System.out.println("Your age is " +edad);
		sc.close();
	}
}
