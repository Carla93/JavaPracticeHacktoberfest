package com.hacktoberfest;

import java.util.Scanner;

public class DiasDiferencia {

	// Este programa calcula cu�ntos d�as de diferencia hay entre dos fechas

	public static void main(String[] args) {

		int d1, d2, m1, m2, a1, a2;

		int dif;

		Scanner sc = new Scanner(System.in);

		System.out.println("PRIMERA FECHA.");

		System.out.println("Introduzca el d�a:");
		d1 = sc.nextInt();
		System.out.println("Introduzca el mes en n�mero:");
		m1 = sc.nextInt();
		System.out.println("Introduzca el a�o:");
		a1 = sc.nextInt();

		System.out.println("SEGUNDA FECHA.");

		System.out.println("Introduzca el d�a:");
		d2 = sc.nextInt();
		System.out.println("Introduzca el mes en n�mero:");
		m2 = sc.nextInt();
		System.out.println("Introduzca el a�o:");
		a2 = sc.nextInt();

		dif = d2 - d1 + 30 * (m2 - m1) + 365 * (a2 - a1);

		if (dif < 0) {

			dif = dif * -1;

			System.out.println("La diferencia es de " + dif + " d�as.");

		}

		else

			System.out.println("La diferencia es de " + dif + " d�as.");

		sc.close();
	}

}
