package exercise2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte edad;

		System.out.println("What's your age?");
		edad = sc.nextByte();
		System.out.println("The next year your age will be " + (edad + 1));
	}
}
