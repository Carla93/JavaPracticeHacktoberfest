package com.hacktoberfest;

import java.util.Scanner;

public class DiasDiferencia {

	// Este programa calcula cuántos días de diferencia hay entre dos fechas

	public static void main(String[] args) {

		int d1, d2, m1, m2, a1, a2;

		int dif;

		Scanner sc = new Scanner(System.in);

		System.out.println("PRIMERA FECHA.");

		System.out.println("Introduzca el día:");
		d1 = sc.nextInt();
		System.out.println("Introduzca el mes en número:");
		m1 = sc.nextInt();
		System.out.println("Introduzca el año:");
		a1 = sc.nextInt();

		System.out.println("SEGUNDA FECHA.");

		System.out.println("Introduzca el día:");
		d2 = sc.nextInt();
		System.out.println("Introduzca el mes en número:");
		m2 = sc.nextInt();
		System.out.println("Introduzca el año:");
		a2 = sc.nextInt();

		dif = d2 - d1 + 30 * (m2 - m1) + 365 * (a2 - a1);

		if (dif < 0) {

			dif = dif * -1;

			System.out.println("La diferencia es de " + dif + " días.");

		}

		else

			System.out.println("La diferencia es de " + dif + " días.");

		sc.close();
	}

}
