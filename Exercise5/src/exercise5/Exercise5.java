package exercise5;

import java.util.Scanner;

/**
 * 5. Diseñar una aplicación que calcule la longitud y el área de una
 * circunferencia. Para ello, el usuario debe introducir el radio, que puede
 * contener decimales.
 */
public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		double longitud;
		double area;

		System.out.println("Which is the radio?");
		radio = sc.nextDouble();
		longitud = (Math.PI * Math.PI) * radio;
		area = Math.PI * (radio * 2);
		System.out.println("The length is " + longitud);
		System.out.println("The area is " + area);
		sc.close();
	}
}
