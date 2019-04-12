package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static Scanner scan;

	public static void menuCalcularAreas(int opcion) {
		
		scan = new Scanner(System.in);
		float num1=0, num2=0, rta=0;
		switch (opcion) 
		{
		
		case 1:
			System.out.println("Ingrese la base del rect�ngulo en cent�metros: ");
			num1=scan.nextFloat();
			System.out.println("Ingrese la altura del rect�ngulo en cent�metros: ");
			num2=scan.nextFloat();
			rta=areaRectangulo(num1,num2);
			System.out.println("El �rea del rect�ngulo es " + rta + " cent�metros cuadrados.");
			break;
			
		case 2:
			System.out.println("Ingrese el lado del cuadrado en cent�metros: ");
			num1=scan.nextFloat();
			rta=areaCuadrado(num1);
			System.out.println("El �rea del cuadrado es " + rta + " cent�metros cuadrados.");
			break;
			
		case 3:
			System.out.println("Ingrese la base del tri�ngulo en cent�metros: ");
			num1=scan.nextFloat();
			System.out.println("Ingrese la altura del tri�ngulo en cent�metros: ");
			num2=scan.nextFloat();
			rta=areaTriangulo(num1,num2);
			System.out.println("El �rea del tri�ngulo es " + rta + " cent�metros cuadrados.");
			break;
			
		case 4:
			System.out.println("Ingrese el radio del c�rculo en cent�metros: ");
			num1=scan.nextFloat();
			rta=areaCirculo(num1);
			System.out.println("El �rea del c�rculo es " + rta + " cent�metros cuadrados.");
			break;
		}
	}

	public static float areaRectangulo(float num1, float num2) {
		float rta = 0;
		rta = num1 * num2;
		return rta;
	}

	public static float areaTriangulo(float num1, float num2) {
		float rta = 0;
		rta = num1 * num2;
		return rta;
	}

	public static float areaCirculo(float num1) {
		float rta = 0;
		rta = (float) (Math.PI * (Math.pow(num1, 2)));
		return rta;
	}

	public static float areaCuadrado(float num1) {
		float rta = 0;
		rta = (float) (Math.pow(num1, 2));
		return rta;
	}
}
